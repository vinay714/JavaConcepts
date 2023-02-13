package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotP {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login/");
		
		//full window screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;

		File sorc = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./webscree/fullscreen.png");
		FileUtils.copyFile(sorc, dest);

		/*/// single element screen shot 
		 * WebElement but=driver.findElement(By.id("loginbutton"));
		 * 
		 * File sorc = but.getScreenshotAs(OutputType.FILE); File dest = new
		 * File("./windo/button.png");
		 * 
		 * FileUtils.copyFile(sorc, dest);
		 * 
		 */
	}
}