import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Own {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://my.concordia.ca/psp/upprpr9/?cmd=login&languageCd=ENG");
		/*System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.getTitle());
		driver.findElement(By.id("userid")).sendKeys("hello");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.linkText("Forgot password?")).click();*/
		
		//driver.findElement(By.xpath("//*[@id='userid']")).sendKeys("hemdeep");
	//	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("hemdeep");
		//driver.findElement(By.xpath("//*[@value='Log in']")).click();
		//driver.findElement(By.id("login_error")).getText();
		
	}

}
