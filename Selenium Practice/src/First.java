import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.ca/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

		driver.get("https://ca.yahoo.com/");
		driver.navigate().back();
		driver.close();
		
		
		
		
	}

}

