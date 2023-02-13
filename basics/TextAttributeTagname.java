package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAttributeTagname {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logbutton = driver.findElement(By.name("login"));
		System.out.println(logbutton.getText());
		System.out.println(logbutton.getTagName());
		System.out.println(logbutton.getAttribute("name"));
		
		
		driver.quit();
		
		

	}

}
