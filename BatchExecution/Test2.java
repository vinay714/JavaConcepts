package BatchExecution;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void demo2() {
		System.out.println("test2 - demo0");
	}
	@Test
	public void demo21() {
		System.out.println("test21 - demo1");
	}
	@Test
	public void demo22() {
		System.out.println("test22 - demo2");
	}

}


/*
[RemoteTestNG] detected TestNG version 7.4.0
test2 - demo0
test21 - demo1
test22 - demo2
test1 - demo0
test11 - demo1
test12 - demo2
test0 - demo0
test01 - demo1
test02 - demo2

===============================================
Suite
Total tests run: 9, Passes: 9, Failures: 0, Skips: 0
===============================================
*/