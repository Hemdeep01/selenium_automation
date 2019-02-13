import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.ca/");
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Hem\\Desktop\\SELENIUM\\Screenshot.png"));

	}

}
  