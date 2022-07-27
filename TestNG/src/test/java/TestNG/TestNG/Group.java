package TestNG.TestNG;

import org.testng.annotations.Test;

public class Group {
	@Test(groups="smoke testing")
	public void abc() {
		System.out.println("abc");
	}

	@Test(groups="regression testing")
	public void pqr() {
		System.out.println("abc1");
	}

	@Test(groups="smoke testing")
	public void xyz() {
		System.out.println("abc2");
	}

}
