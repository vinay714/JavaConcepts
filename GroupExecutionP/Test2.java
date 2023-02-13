package GroupExecutionP;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups= "smoke")
	public void demo1() {
		System.out.println("Test2 smoke");
	}
	@Test(groups = "system")
	public void demo2() {
		System.out.println("Test2 system");
	}
	@Test(groups = "system")
	public void demo3() {
		System.out.println("Test2 system");
	}
	@Test(groups = {"smoke","system"})
	public void demo4() {
		System.out.println("Test2 smoke, system");
	}

}
