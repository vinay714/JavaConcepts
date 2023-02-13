package ThirdChaptor;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		FacebookLoginPageObjectModel login = new FacebookLoginPageObjectModel(driver);

		login.setUserName("vinay");
		login.setPassword("5165");
		login.clickLoginButton();

		Thread.sleep(3000);
		driver.quit();

	}

}
