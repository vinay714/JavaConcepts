package Assertions;

import org.testng.annotations.Test;

public class SimpleProgramOnAssertion {
	
	@Test
	public void demo() {
		String s1 = "hello",s2 = "world";
		if (s1.contains(s2))
		System.out.println("pass");
		else
			System.out.println("fail");
	}

}
