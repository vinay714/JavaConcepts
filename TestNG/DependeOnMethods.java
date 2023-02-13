package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependeOnMethods {
	WebDriver driver;
	@Test
	public void navigateToActitime() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
	@Test(dependsOnMethods="navigateToActitime")
	public void loginToActitime() {
		driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		WebElement userprofile = driver.findElement(By.className("userProfileLink"));
		if(userprofile.isDisplayed())
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();
	}
		
}


