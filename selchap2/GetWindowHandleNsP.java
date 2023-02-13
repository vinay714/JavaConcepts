package selchap2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleNsP {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("//*[@id=\\\"front-header\\\"]/div[3]/header/div/div/div[3]/ul/li[3]/ul/li[2]/a"));
		
		String parentID = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		
		for (String id : windows) {
			driver.switchTo().window(id);
		}
		Thread.sleep(2000);
		driver.findElement(By.id("mytext")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id=\"nameDisplay\"]/div/div/div/input[2]")).click();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentID);
		driver.quit();
		
		
		
		
		}
		
		
}
