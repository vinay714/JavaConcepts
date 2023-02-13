package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement ctab =driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(ctab).perform();
		driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/div/div/span/a[2]")).click();
		
		int quantitybefore = Integer.parseInt(driver.findElement(By.id("quantity")).getAttribute("value"));
		WebElement pbutton = driver.findElement(By.id("add"));
		a.doubleClick(pbutton).perform();
		
		int quantityafter = Integer.parseInt(driver.findElement(By.id("quantity")).getAttribute("value"));
		if(quantityafter ==quantitybefore +1)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		driver.quit();
	}

}
