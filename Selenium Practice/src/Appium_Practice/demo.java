package Appium_Practice;

import org.openqa.selenium.remote.DesiredCapabilities;

public class demo 
{
	public static void main(String[] args)
	{
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("MobileCapabilityType.DEVICE_NAME" , "Hememulator" );
		cap.setCapability("MobileCapabilityType.APP" , value);
	}
}