package basics;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethod {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demo.actitime.com/login.do");
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement element = driver.findElement(By.linkText("Log in"));
		
		System.out.println(element.getAccessibleName());
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getCssValue("background-color"));
		
		Rectangle r = element.getRect();
		System.out.println("Heighi "+r.getHeight());
		System.out.println("width "+r.getWidth());
		System.out.println("X Coordinate "+r.getX());
		System.out.println("Y Coordinat "+r.getY());
		 
		driver.quit();
		
		
		

}}
