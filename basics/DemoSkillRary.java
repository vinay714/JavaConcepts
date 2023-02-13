package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSkillRary {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(5000);
	}

}
//skillRary xpath for gears 
//a[@class = 'dropdown-toggle ignorelink' and text() = ' GEARS ']



//google meet chat xpath
//i[contains(@class,'NtU4hc')and text() = 'chat']