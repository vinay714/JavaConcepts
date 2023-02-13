package BatchExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo1() {
		System.out.println("test1 - demo0");
	}
	@Test
	public void demo11() {
		System.out.println("test11 - demo1");
		//Assert.fail();
	}
	@Test
	public void demo12() {
		System.out.println("test12 - demo2");
	}


}
