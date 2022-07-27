package TestNG.TestNG;

import org.testng.annotations.Test;

public class Demo4 {
	@Test(groups="regression testing")
	public void testcasesa() {
		System.out.println("test case a");
	}
	
	@Test(priority=1)//4
	public void testcasesz() {
		System.out.println("test case z");
	}
	
	@Test(groups="regression testing")
	public void testcasesp() {
		System.out.println("test case p");
	}
	
	@Test(priority=2)//5
	public void testcasesm() {
		System.out.println("test case m");
	}
	
	@Test(priority=0)//3
	public void testcasest() {
		System.out.println("test case t");
	}

}
