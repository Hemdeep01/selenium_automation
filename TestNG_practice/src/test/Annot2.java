package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annot2 {
	
	public WebDriver driver=null;
	@Test
	public void Login() throws IOException
	{	
		Properties prop = new Properties();
		FileInputStream f= new FileInputStream("C:\\Users\\Hem\\Desktop\\SELENIUM\\repo\\TestNG_practice\\datadriven.properties");
		prop.load(f);
		//System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe" );
		 driver= new ChromeDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void software()
	{
		System.out.println("i am the test");
	}
	@AfterSuite
	public void deinstallSoftware()
	{
		System.out.println("i am the last");
	}
	
}
