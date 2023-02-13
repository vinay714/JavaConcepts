package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationP {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dress = driver.findElement(By.xpath("//img[@alt='Dresses']"));
		Point loc = dress.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x);
		System.out.println(y);
		
		driver.quit();
		
}}
