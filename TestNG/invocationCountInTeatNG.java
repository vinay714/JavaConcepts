package TestNG;

import org.testng.annotations.Test;

public class invocationCountInTeatNG {

	@Test(invocationCount=2)
	public void test() {
		System.out.println("test()");
	}
	@Test
	public void test1() {
		System.out.println("test1()");
	}
	@Test(invocationCount=0)
	public void test2() {
		System.out.println("test2()");
	}
	@Test(invocationCount=-2)
	public void test3() {
		System.out.println("test3()");
	}
	@Test(invocationCount=4)
	public void test4() {
		System.out.println("test4()");
	}
}

/*
 * //output
[RemoteTestNG] detected TestNG version 7.4.0
test()
test()
test1()
test4()
test4()
test4()
test4()
PASSED: test
PASSED: test4
PASSED: test4
PASSED: test
PASSED: test4
PASSED: test1
PASSED: test4*/
