package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 {

	@Test(groups= {"smoke"})
	public void webLoginHomeLoan()
	{
		System.out.println("web login home");
	}

	@Test
	public void MobileLoginHomeLogin()
	{
		System.out.println("mobile login home");
		//assert.assertTrue(false);

	}
	
	@BeforeSuite
	public void LoginApiHome()
	{
		System.out.println("login api home");
		
	}
}
