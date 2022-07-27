package TestNG.TestNG;

import org.testng.annotations.Test;

public class Demo3 {
	@Test(priority=1)
	public void pune() {
		System.out.println("pune");
	}
	
	@Test(priority=1)
	public void mumbai() {
		System.out.println("mumbai");
	}
	
	@Test(priority=101)
	public void delhi() {
		System.out.println("delhi");
	}

}
