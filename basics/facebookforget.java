package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookforget {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement link =driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		Thread.sleep(5000);
		
		
		driver.quit();
		

	}

}
