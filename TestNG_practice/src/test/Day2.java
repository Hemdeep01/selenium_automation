package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test
	public void ploan()
	{
		System.out.println("bad");
	}
	
	@BeforeTest
	public void prereq()
	{
		System.out.println("im the first");
	}

}
