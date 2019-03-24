package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Three {
	@BeforeMethod
	public void OneOfTHree()
	{
		System.out.println("i am 1 of 3");
	}
	@BeforeTest
	public void TwoOfTHree()
	{
		System.out.println("i am 2 of 3");
		
	}@BeforeSuite
	public void ThreeOfTHree()
	{
		System.out.println("i am 3 of 3");
	}@Test
	public void FourofTHree()
	{
		System.out.println("i am 4 of 3");
	}

}
