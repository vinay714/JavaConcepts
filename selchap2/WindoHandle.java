package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindoHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sigin = driver.findElement(By.className("accountUserName"));
		Actions a = new Actions(driver);
		a.moveToElement(sigin).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'login')]")).click();
		Thread.sleep(3000);
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("35345614");
		driver.findElement(By.id("close-pop")).click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("inputValEnter")).sendKeys("dresses");
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		


}}
