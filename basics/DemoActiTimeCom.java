package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActiTimeCom {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		
		if(driver.getTitle().contains("actiTIME"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
