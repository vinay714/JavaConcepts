package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.className("ui-autocomplete-input")).sendKeys("headphone");
		driver.findElement(By.className("gh-spr")).click();
		Thread.sleep(3000);
			
		driver.quit();
		
		

	}

}
