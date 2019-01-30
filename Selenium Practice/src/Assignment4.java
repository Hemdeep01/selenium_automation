import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.xpath("/html/body/div[1]/div[4]/fieldset"));
		driver.findElement(By.id("checkBoxOption2")).click();
		String opt=driver.findElement(By.xpath(("//*[@id='checkbox-example']/fieldset/label[2]"))).getText();
		//System.out.println(opt);
		
		//System.out.println(option);
	driver.findElement(By.id("dropdown-class-example")).click();
		Select s= new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(opt);
		
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
	String something=	driver.switchTo().alert().getText();
	if(something.contains(opt))
	{
		System.out.println("alert contains "+opt);
	}
	else
	{
		System.out.println("alert does not contain "+opt);
	}
		
		
	}

}
