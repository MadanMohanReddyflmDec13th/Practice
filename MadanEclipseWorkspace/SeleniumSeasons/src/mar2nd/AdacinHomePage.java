package mar2nd;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import graphql.Assert;


public class AdacinHomePage {
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Browser started");
		System.out.println("App Launched");
	}
	
	@AfterMethod
	public void teardown() {
		System.out.println("Browser closed...");
	}
	
	@Test(priority = 2)
	public void loginTest()
	{
		Assert.assertTrue(false);
		System.out.println("Login success");
	}
	
	@Test(priority = 1)
	public void registerTest()
	{
		
		System.out.println("Resgistration Success");
	
	}
	
	@Test(priority = 3)
	public void forgotPasswordTest()
	{
		
		System.out.println("ForgotPassword Success");
	
	}
	
	@Test(priority=4,dependsOnMethods = "loginTest")
	public void changePasswordTest()
	{
		System.out.println("ChangePassword successfull..");
	}

}
