import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExerciseCricBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		int sum1=0;
		int sum2=0;
		int sumTotal=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21259/wi-vs-eng-3rd-test-england-tour-of-west-indies-2019");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowCount=table.findElements (By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements (By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3) ")).size();
		//System.out.println(count);
		for(int i=0;i<count-2;i++)
		{
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3) ")).get(i).getText();
			//System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3) ")).get(i).getText());
			int valueInteger=Integer.parseInt(value); 
			sum1=sum1+valueInteger;
		}
		System.out.println("Sum of scores:" +sum1);
		//System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div ")).getText());
		String ValueExtra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div ")).getText();
		int ExtraInteger=Integer.parseInt(ValueExtra);
		sum2=sum2+ExtraInteger;
		System.out.println("Sum of Extras:"+sum2);
		sumTotal=sum1+sum2;
		System.out.println("Total sum:"+sumTotal);
		
		String valueOnScreen=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div ")).getText();
		System.out.println("value of total printed on screen:" +valueOnScreen);
		int IntegerTotalOnScreen=Integer.parseInt(valueOnScreen);
		if(sumTotal==IntegerTotalOnScreen)
		{
			System.out.println("Total is correct");
		}
		else
		{
			System.out.println("Incorrect Total");
		}

		
		
		
		
	}

}
