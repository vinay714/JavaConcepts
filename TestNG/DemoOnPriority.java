package TestNG;

import org.testng.annotations.Test;

public class DemoOnPriority {
	
	@Test(priority=1)
	public void demo1() {
		System.out.println("demo1");
	}
	@Test(priority=-1)
	public void demo2() {
		System.out.println("demo2");
	}
	@Test
	public void demo3() {
		System.out.println("demo3");
	}
	@Test(priority=-2)
	public void demo4() {
		System.out.println("demo4");
	}
	@Test(priority=2)
	public void demo5() {
		System.out.println("demo5");
	}

}

//output
/*demo4
demo2
demo3
demo1
demo5
PASSED: demo5
PASSED: demo2
PASSED: demo4
PASSED: demo3
PASSED: demo1*/