package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.TAB+Keys.ENTER);
		//driver.findElement(By.partialLinkText("Forgotten")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		Thread.sleep(3000);
		System.out.println("--------------");
		
		driver.quit();

}}
