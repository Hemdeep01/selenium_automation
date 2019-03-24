package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Day3 {
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname)
	{
		System.out.println("web login car");
		System.out.println(urlname);
	}

	@Test(groups= {"smoke"})

	public void MobileLoginCarLoan()
	{
		System.out.println("mobile login car");
		
	}
	
	@Test(dataProvider="getData")
	public void LoginApiCar(String username, String password)
	{
		System.out.println("login api car");
		System.out.println (username);
		System.out.println(password);
		
	}
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination- username/password--good credit history 
		//2nd combination- username/ password--no credit history
		//3rd combination- fraud credit history
		
		Object[][] data = new Object[3][2];
		data[0][0]="firstset";
		data[0][1]="abc123_9";
		data[1][0]="secondset";
		data[1][1]="password";
		data[2][0]="thirdset";
		data[2][1]="iloveyoukannu_143";
		
		return data;
		
	}
	
}
