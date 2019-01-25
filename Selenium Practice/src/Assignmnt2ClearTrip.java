import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignmnt2ClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Hem\\Desktop\\SELENIUM\\geckodriver-v0.23.0-win64//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(9000L);
		// driver.switchTo().alert().accept();
		driver.findElement(By.id("FromTag")).click();
		driver.findElement(By.id("FromTag")).sendKeys("amr");
		Thread.sleep(6000L);
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);

		Thread.sleep(4000L);
		driver.findElement(By.id("ToTag")).sendKeys("del");
		Thread.sleep(6000L);
		driver.findElement(By.id("ToTag")).sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("2");

		Select c = new Select(driver.findElement(By.id("Childrens")));
		c.selectByValue("2");

		driver.findElement(By.id("MoreOptionsLink")).click();
		Select e = new Select(driver.findElement(By.id("Class")));
		e.selectByValue("First");

		driver.findElement(By.id("AirlineAutocomplete")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("ind");
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys(Keys.ENTER);

	}

}
