import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReddifMail {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@name='passwd']")).sendKeys("jsaksxm");
		driver.findElement(By.xpath("//*[contains(@name,'procee')]")).click();
	}
}
