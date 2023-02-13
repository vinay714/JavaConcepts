package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelScrollTillTheElementApper {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"Kp1K1db7cnlVI8wUmpFX4w\"]/div[1]/h2"));
		Point loc=ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		driver.quit();
		
	}
}
