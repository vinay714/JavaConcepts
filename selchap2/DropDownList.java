package selchap2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ebay.com/");
		
		WebElement drop = driver.findElement(By.id("gh-cat"));
		
		Select s =new Select(drop);
		List<WebElement> options =s.getOptions();
		for(WebElement element : options) {
			System.out.println(element.getText());
		}
		driver.quit();
}}
