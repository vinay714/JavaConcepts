package TestNG;

import org.testng.annotations.Test;

public class priorityandinvocationCount {

	@Test(invocationCount=2,priority =-1)
	public void test() {
		System.out.println("test()");
	}
	@Test(priority =2)
	public void test1() {
		System.out.println("test1()");
	}
	@Test(invocationCount=3,priority = 1)
	public void test2() {
		System.out.println("test2()");
	}
	@Test(invocationCount=0,priority = 1)
	public void test3() {
		System.out.println("test3()");
	}
	@Test(invocationCount=4,priority = 3)
	public void test4() {
		System.out.println("test4()");
	}
}

/*
 *  //output
[RemoteTestNG] detected TestNG version 7.4.0
test()
test()
test2()
test2()
test2()
test1()
test4()
test4()
test4()
test4()
PASSED: test4
PASSED: test4
PASSED: test2
PASSED: test4
PASSED: test
PASSED: test4
PASSED: test
PASSED: test1
PASSED: test2
PASSED: test2

 */

