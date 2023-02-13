package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByUsingElementReference {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://www.amazon.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollBy(0,5000)");  //scroll by by heardcoding value 
		
		
		
		//WebElement ele = driver.findElement(By.xpath("//h2[text()='Electronics']"));
		//js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		
		//WebElement fld = driver.findElement(By.id("twotabsearchtextbox"));    //search field reference variable
		//WebElement but = driver.findElement(By.id("nav-search-submit-button")); //search button reference variable
		//Thread.sleep(3000);
		//js.executeScript("arguments[0].value=arguments[1]",fld,"iphone");  //search in the text field by giving iphone
		//js.executeScript("arguments[0].click()", but);						//clicking on search button
		//Thread.sleep(3000);
		
		
		// js.executeScript("window.location=arguments[0]","https://www.facebook.com/"); // to navigate to other application
		
		//driver.get("file:///C:/Users/Vinay%20Kumar%20G%20S/Desktop/name.html");  //url opened in chrome that is created by you by giving argument as <input type="text" id="abc" disabled="">
		//WebElement elt = driver.findElement(By.id("abc"));							//and save file as html as extension in notepad
		//js.executeScript("arguments[0].value=arguments[1]",elt, "vinay");
		
		Thread.sleep(3000);
		js.executeScript("history.go[0]"); // to refresh the page
		System.out.println("completed");

	}
}
