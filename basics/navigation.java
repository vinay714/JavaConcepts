package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.ebay.com/");
		//Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		//Thread.sleep(2000);
	//	driver.navigate().back();			//	to navigate back to page
	//	Thread.sleep(2000);
	//	driver.navigate().forward()			// to navigaate forward page
	//	driver.navigate().refresh();		//to refresh the page
		
		Thread.sleep(2000);
		//driver.navigate().to("https://www.ebay.com/");  //to navigate one url to other
		driver.navigate().to("https://www.ebay.com/");
		
		
		
	}

}
