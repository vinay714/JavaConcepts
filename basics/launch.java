package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// EdgeDriver drive = new EdgeDriver();
		// System.setProperty(webDriver, )

		// driver.get("https://demo.automationtesting.in/Register.html");
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String scd = driver.getPageSource();

		/*
		 * System.out.println("----------------------------------");
		 * System.out.println(title);
		 * System.out.println("----------------------------------");
		 * System.out.println(url);
		 * System.out.println("----------------------------------");
		 * //System.out.println(scd);
		 */

		Thread.sleep(5000);
		driver.quit();

	}

}
