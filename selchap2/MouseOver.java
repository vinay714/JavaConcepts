package selchap2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");

		WebElement kids = driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/a"));
		Actions a = new Actions(driver);
		a.moveToElement(kids).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = driver.findElement(
				By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[3]/div/div/div/div/li[3]/ul/li[11]/a"));
		String text = wait.until(ExpectedConditions.visibilityOf(element)).getText();

		System.out.println(text);
		if (text.contains("Learning"))
			System.out.println("pass");
		else
			System.out.println("fail");

		driver.quit();
	}

}
