import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	
	driver.get("https://login.salesforce.com/");
	/*	driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("12345");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		System.out.println(driver.findElement(By.id("error")).getText());
		*/
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
	
}
