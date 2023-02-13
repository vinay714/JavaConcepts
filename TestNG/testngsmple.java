package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngsmple {
	
	@Test
	public void demotest() {
		
		//int x=5,y=6;
		//Reporter.log("sum of this two is ",x+y,true);// not posible to print 
		Reporter.log("hello vinay",true); // to print on concole we use statement
		
	}

}
/*
 * //output
[RemoteTestNG] detected TestNG version 7.4.0
hello vinay
PASSED: demotest*/
