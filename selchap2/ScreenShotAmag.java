package selchap2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotAmag {
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./webscreenshot/screenshot.png");
		//File dest2= new File("./webscreenshot/"+new ScreenShotAmag().getClass().getSimpleName()+".png");
		FileUtils.copyFile(src, dest);
		
		Thread.sleep(3000);
		driver.quit();
		
		

}}
