package mar2nd;

import org.testng.annotations.Test;

public class AdactinLogin2 {
	
	@Test
	public void  loginUsingValidUsernameAndValidPassword()
	{
		System.out.println("Browser Started ..");
		System.out.println("App launched..");
		System.out.println("Valid Username Entered ...");
		System.out.println("Valid Password Entered ...");
		System.out.println("Login Button Clicked..");
		System.out.println("loginUsingValidUsernameAndValidPassword is passed ..");
		System.out.println("Browser Closed ...");
	}
	
	@Test
	public void loginUsingInValidUsernameAndValidPassword()
	{
		System.out.println("Browser Started ..");
		System.out.println("App launched..");
		System.out.println("InValid Username Entered ...");
		System.out.println("Valid Password Entered ...");
		System.out.println("Login Button Clicked..");
		System.out.println("loginUsingnInValidUsernameAndValidPassword is passed ..");
		System.out.println("Browser Closed ...");
	}
	
	@Test
	public void loginUsingValidUsernameAndInValidPassword()
	{
		System.out.println("Browser Started ..");
		System.out.println("App launched..");
		System.out.println("InValid Username Entered ...");
		System.out.println("Valid Password Entered ...");
		System.out.println("Login Button Clicked..");
		System.out.println("loginUsingnValidUsernameAndInValidPassword is passed ..");
		System.out.println("Browser Closed ...");
	}
}
