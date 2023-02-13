package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalanderNotifications {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.yatra.com/hotels");
		
		driver.findElement(By.xpath("//*[@id=\"bEnginePos\"]/ul/li[1]")).click();
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.id("25/02/2023")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
