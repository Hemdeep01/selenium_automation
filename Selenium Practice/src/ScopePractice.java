import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopePractice {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
	//	driver.findElement(By.id("gf-BIG"));
	WebElement col=	driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr/td[1]/ul"));
	int size=col.findElements(By.tagName("a")).size();
	System.out.println(size);
	for(int i=1;i<size;i++)
	{
		String click=Keys.chord(Keys.CONTROL,Keys.ENTER);
		col.findElements(By.tagName("a")).get(i).sendKeys(click);
	}
	Set<String> xyz=driver.getWindowHandles();
	Iterator<String>it=xyz.iterator();
	while(it.hasNext())
	{
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	
		
	}

}
