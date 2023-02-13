package ThirdChaptor;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginScript {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./TestResources/CommonData.properties");
		Properties ppt = new Properties();
		ppt.load(fis);
		
		String url = ppt.getProperty("url");
		
		long time = Long.parseLong(ppt.getProperty("timeouts"));
		WebDriver driver=null;
		String browser=ppt.getProperty("browser");
		switch(browser) 
		{
		case "chrome": driver=new ChromeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		}
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.get(ppt.getProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		
		driver.findElement(By.id("username")).sendKeys(ppt.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(ppt.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		boolean status =wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		if (status)
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();

	}

}
