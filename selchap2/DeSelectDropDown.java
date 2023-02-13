package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement drop = driver.findElement(By.id("cars"));
		
		Select s = new Select(drop);
		if(s.isMultiple()) {
			s.selectByIndex(0);
			s.selectByValue("99");
			s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
			Thread.sleep(5000);
			
			s.deselectByIndex(0);
			Thread.sleep(2000);
			s.deselectByValue("99");
			Thread.sleep(2000);
			s.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
			Thread.sleep(2000);
			//s.deselectAll();
			
			
			
			
			}
		driver.quit();
		}
	

}
