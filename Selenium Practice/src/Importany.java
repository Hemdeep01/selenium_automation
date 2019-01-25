import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Importany {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	//	driver.findElement(By.id("email")).sendKeys("This is my first code");
	//	driver.findElement(By.name("pass")).sendKeys("password");
		//driver.findElement(By.linkText("Forgotten account?")).click();
	//	driver.findElement(By.cssSelector("#email")).sendKeys("hemi");
	//	driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
	//	driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("name");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
	//	driver.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
		driver.findElement(By.cssSelector("input[id*='u_0']")).click(); 

		
		
	}
}