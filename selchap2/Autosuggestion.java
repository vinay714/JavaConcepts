package selchap2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("iphones");
		Thread.sleep(2000);
		List<WebElement> lists = driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		for(WebElement list:lists)
		{
			System.out.println(list.getText());
		}
		
		

	}

}
