import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstForFirefox {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\geckodriver-v0.23.0-win64//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.ca/");
		System.out.println(driver.getTitle());
		
	}

}
