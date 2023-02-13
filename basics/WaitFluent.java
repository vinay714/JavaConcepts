package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class WaitFluent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebElement header = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver) {
				WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
						if(text.isDisplayed())
							return text;
						else
							return null;
			}
		});
		
		
		System.out.println(header.getText());
		
		driver.quit();
	}

}
