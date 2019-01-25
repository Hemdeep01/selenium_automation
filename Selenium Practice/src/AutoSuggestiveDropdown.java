import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		WebElement source=driver.findElement(By.id("hp-widget__sfrom"));
		WebElement dest=driver.findElement(By.id("hp-widget__sTo"));
		WebElement departDate=driver.findElement(By.id("hp-widget__depart"));


		source.clear();
		Thread.sleep(2000L);
		source.sendKeys("mum");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		driver.findElement(By.id("hp-widget__sTo")).clear();
		Thread.sleep(2000L);
		dest.sendKeys("che");
		Thread.sleep(2000L);
		for(int i=1;i<5;i++)
		{
		dest.sendKeys(Keys.DOWN);
		Thread.sleep(2000L);

		}
		Thread.sleep(2000L);
		dest.sendKeys(Keys.ENTER);
		
		

		

	}

}
