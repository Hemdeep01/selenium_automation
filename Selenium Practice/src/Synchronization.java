import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(
				"https://www.expedia.ca/Hotels?semcid=CA.UB.GOOGLE.GT-c-EN.HOTEL&semdtl=a1366577269.b126162942229.r1.g1kwd-1260033322.i1.d1312735666476.e1c.j19000414.k1.f11o2.n1.l1g.h1e.m1&gclid=Cj0KCQiAp7DiBRDdARIsABIMfoDa3YGQIcillUDss0AivK_ENGsD_jW4cjWdiK7pb-OPZ0FX4geHgjwaAk5vEALw_wcB");
		driver.findElement(By.id("hotel-destination-hlp")).click();
		driver.findElement(By.id("hotel-destination-hlp")).sendKeys("nyc");
		driver.findElement(By.id("hotel-destination-hlp")).sendKeys(Keys.ENTER);
		// driver.findElement(By.id("hotel-destination-hlp")).sendKeys(Keys.ENTER);

		WebDriverWait d=new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/form/div[13]/div[2]/div[14]/section/div/div[20]/section/article[1]/div[2]/div")));
		driver.findElement(By.xpath("/html/body/div[4]/form/div[13]/div[2]/div[14]/section/div/div[20]/section/article[1]/div[2]/div")).click();
		
		
		
	}

}
