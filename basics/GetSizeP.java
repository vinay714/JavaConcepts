package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeP {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement lobutton = driver.findElement(By.name("login"));
		Dimension d = lobutton.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		Thread.sleep(3000);
		
		driver.quit();
		

}}
