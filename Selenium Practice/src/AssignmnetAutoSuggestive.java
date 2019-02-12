import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Return;

public class AssignmnetAutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
		String text= "return document.getElementById('autocomplete').value;";
		String app=(String)js.executeScript(text);
		//System.out.println(app);
		int i=0;
		while(!app.equalsIgnoreCase("India"))
		{	i++;
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
			text= "return document.getElementById('autocomplete').value;";
			app=(String)js.executeScript(text);
			if(i>10)
			{
				System.out.println("element not found");
				break;
			}

		}
		System.out.println(app);

		

	}

}
