package selchap2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		WebElement drop = driver.findElement(By.id("cars"));
		
		Select s = new Select(drop);
		if(s.isMultiple()) {
			s.selectByIndex(5);
			Thread.sleep(3000);
			s.selectByValue("199");
			Thread.sleep(3000);
			s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
			Thread.sleep(3000);
			System.out.println("first selected option is"+s.getFirstSelectedOption().getText());
			List<WebElement> selectoption = s.getAllSelectedOptions();
			for(WebElement element: selectoption) {
				System.out.println(element.getText());
			}}
			
		else
			System.out.println("not multi select");
		
		
		driver.quit();
		
		
		

}}
