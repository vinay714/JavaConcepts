package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClickOption {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		WebElement scrbutt = driver.findElement(By.id("nav-search-submit-button"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
	
		
		
		js.executeScript("arguments[0].value = arguments[1]",search," Onida TV");
		js.executeScript("arguments[0].click()",scrbutt);
		
		Thread.sleep(3000);
		
		driver.quit();

}}
