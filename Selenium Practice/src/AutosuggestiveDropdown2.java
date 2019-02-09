import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveDropdown2 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/oprs-web/guest/home.do?h=1");
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).getText();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String text="return document.getElementById('fromPlaceName').value;";
		//System.out.println(text);
		String app = (String) js.executeScript(text);
		System.out.println(app);
		int i=0;
		
		while(!app.equalsIgnoreCase("BENGALURU INTERNATION AIPORT"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			//System.out.println(text);
			app = (String) js.executeScript(text);
			System.out.println(app);
			if(i>10)
			{
				System.out.println("element not found");
				break;
			}
			

		}
	}

}
