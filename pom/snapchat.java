package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapchat {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/login?continue=%2Faccounts%2Fwelcome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		POMOfSnapChat sc=new POMOfSnapChat(driver);
		sc.username("vinay");
		sc.password("1565");
		sc.Next();
		
			
			
		
	}

}
