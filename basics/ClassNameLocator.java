package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.id("toLoginPageLink")).sendKeys("manager");
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
