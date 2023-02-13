package TestNG;

import org.testng.annotations.Test;

public class EnabledFalseP {

	@Test(priority =2)
	public void test0() {
		System.out.println("test0()");
	}
	@Test(enabled =false)
	public void test1() {
		System.out.println("test1()");
	}
}
/*
output
[RemoteTestNG] detected TestNG version 7.4.0
test0()
PASSED: test0

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================*/