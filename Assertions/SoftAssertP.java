package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertP {
	
	@Test
	public void demo() {
		
		SoftAssert soft = new SoftAssert();
		String s1 = "hello",s2 = "world";
		
		
		soft.assertEquals(s1, s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Assert fail");
		soft.assertAll();
		
	}
	@Test
	public void demo2() {
		String s1 = "hello",s2 = "world";
		System.out.println("demo2 "+s1);
		System.out.println("demo2 "+s2);
		

}}
