package GroupExecutionP;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups= "system")
	public void demo1() {
		System.out.println("Test3 system");
	}
	@Test(groups = "sanity")
	public void demo2() {
		System.out.println("Test3 sanity");
	}
	@Test(groups = "sanity")
	public void demo3() {
		System.out.println("Test3 sanity");
	}
	@Test(groups = {"sanity","system"})
	public void demo4() {
		System.out.println("Test3 system sanity");
	}
	@Test
	public void demo5() {
		System.out.println("Test3 no test");
	}

}
