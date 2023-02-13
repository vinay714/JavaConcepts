package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementVerification {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		
		if (element.isEnabled()) 
			System.out.println("is Enabled");
			
			else
		
			System.out.println("is disabled");
			
		driver.quit();
}}
