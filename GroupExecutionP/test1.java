package GroupExecutionP;

import org.testng.annotations.Test;

public class test1 {
		
	@Test(groups= "smoke")
	public void demo1() {
		System.out.println("Test1 smoke");
	}
	@Test(groups = "sanity")
	public void demo2() {
		System.out.println("Test1 sanity");
	}
	@Test(groups = "Regression" )
	public void demo3() {
		System.out.println("Test1 Regression");
	}
	@Test(groups = { "Regression" , "smoke","sanity"})
	public void demo4() {
		System.out.println("Test1 Regression, smoke ,sanity");
	}

}
