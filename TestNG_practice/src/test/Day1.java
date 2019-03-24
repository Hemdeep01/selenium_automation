package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	@Parameters({"URL"})

	@Test
	public void demo(String uname)
	{
		System.out.println("hello");
		System.out.println(uname);

	}
	@Parameters({"Apikey"})
	@Test(groups= {"smoke"})

	public void secondTest(String api)
	{
		System.out.println("good");
		System.out.println(api);
	}

}
