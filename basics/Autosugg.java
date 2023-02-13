package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");

		Thread.sleep(3000);

		List<WebElement> list = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));

		Thread.sleep(3000);
		for (WebElement i : list) {
			System.out.println(i.getText());
		}

	}

}
