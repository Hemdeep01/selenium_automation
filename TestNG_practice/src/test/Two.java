package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Two {
	@Test
	public void OneOfTwo()
	{
		System.out.println("i am 1 of 2");
	}
	
	@Test
	public void TwoOfTwo()
	{
		System.out.println("i am 2 of 2");
	}
	
	@BeforeSuite
	public void ThreeOfTwo()
	{
		System.out.println("i am 3 of 2");
	}

}
