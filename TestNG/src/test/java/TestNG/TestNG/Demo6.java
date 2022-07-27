package TestNG.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo6 {
	@Test(priority=1)
	public void loginfunctionality() {
		Assert.assertEquals("login", "Amin");
		
	}
	@Test(dependsOnMethods= {"loginfunctionality"},priority=2)
	public void homefunctionality() {
		System.out.println("home functionality");
		
	}
	@Test(priority=3)
	public void pimfunctionality() {
		System.out.println("pim functionality");	
	
	}
	@Test(priority=4)
	public void logoutfunctionality() {
		System.out.println("logout functionality");	
	
	
	}
}
