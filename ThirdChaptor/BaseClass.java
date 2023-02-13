package ThirdChaptor;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void suiteConfiguration() {
		System.out.println("Beforesuite");
	}
	@BeforeTest
	public void testConfiguration() {
		System.out.println("beforetest");
	}
	@BeforeClass
	public void classConfiguration() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void methodConfiguration() {
		System.out.println("befoemethod");
	}
	@AfterMethod
	public void methodTeardown() {
		System.out.println("Aftermethod");
	}
	@AfterClass
	public void classTeardown() {
		System.out.println("Aftermethod");
	}
	@AfterTest
	public void testTeardown() {
		System.out.println("Aftermethod");
	}
	@AfterSuite
	public void suiteTeardown() {
		System.out.println("Aftermethod");
	}
	

}
