package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendFiles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("E:\\testing\\database table.txt");
		
		//driver.findElement(By.id("pop_upload")
		
		Thread.sleep(3000);
		
		
		
		

}}
