import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignmnt2ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\geckodriver-v0.23.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(9000L);
		//driver.switchTo().alert().accept();
		driver.findElement(By.id("FromTag")).click();
		driver.findElement(By.id("FromTag")).sendKeys("amr");
		Thread.sleep(6000L);
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
		
		Thread.sleep(4000L);
		driver.findElement(By.id("ToTag")).sendKeys("del");
		Thread.sleep(6000L);
		driver.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);
		

	}

}
