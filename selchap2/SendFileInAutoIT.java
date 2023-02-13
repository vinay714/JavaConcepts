package selchap2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendFileInAutoIT {
	public static void main(String[]args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[5]/div[1]/div[1]/button")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("\"E:\\Q spider\\java\\AutoIT\\fileone.exe\""); //The patch is of autoIT generated compiled file 
		
		
		
	}

}
