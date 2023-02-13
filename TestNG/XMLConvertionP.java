package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ThirdChaptor.BaseClass;

public class XMLConvertionP extends BaseClass {
	@Test
	public void googleTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (driver.getTitle().contains("Google"))
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();	
	}
	@Test
	public void facebookTitle() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if (driver.getTitle().contains("facebook"))
			System.out.println("pass");
		else
			System.out.println("fail");
	driver.quit();
	}
	

}
