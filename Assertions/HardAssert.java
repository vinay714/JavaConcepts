package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void demo() {
		String s1 = "hello",s2 = "world";
		Assert.assertEquals(s1, s2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Assert fail");
	}
	@Test
	public void demo2() {
		String s1 = "hello",s2 = "world";
		System.out.println("demo2 "+s1);
		System.out.println("demo2 "+s2);
		
	}

}
