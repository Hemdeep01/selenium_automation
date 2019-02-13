import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificateCapabilities {

	public static void main(String[] args)
	{
		DesiredCapabilities ch=DesiredCapabilities.chrome();
	//	ch.acceptInsecureCerts();// both this step and next step are same.
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Hem\\Desktop\\SELENIUM\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver(c);
		
	}
}
