package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitAndClear {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(2000);
		search.sendKeys("laptop");
		Thread.sleep(2000);
		search.clear();
		search.sendKeys("smrt wathes");
		driver.findElement(By.id("nav-search-submit-button")).submit();
		Thread.sleep(3000);
		driver.quit();
		
		
		driver.quit();
		
		
		
		

	}

}
