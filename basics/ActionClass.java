package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement course = driver.findElement(By.id("course"));
	Actions act = new Actions(driver);
	act.moveToElement(course).perform();
	driver.findElement(By.xpath("//span/a[contains(text(),'Selenium Training')]")).click();
	
	WebElement selimg= driver.findElement(By.xpath("//img[contains(@src,'images/selenium-training')]"));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(selimg));
	
	driver.quit();

	}

}
