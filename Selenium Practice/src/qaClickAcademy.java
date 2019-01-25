import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaClickAcademy {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.linkText("Interview Guide")).click();
	//	driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
	//	driver.findElement(By.xpath("//body/section/div/div/div/div/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@text()=' Selenium ']")).click();

		   
		
		
	}
}
