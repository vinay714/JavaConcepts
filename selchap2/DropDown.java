package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/");
		
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(drop);
		
		if (s.isMultiple())
			System.out.println("yes multi select");
		else
			System.out.println("single select");
		
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=stripbooks-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Computers");
		Thread.sleep(3000);
		driver.quit();

}}
