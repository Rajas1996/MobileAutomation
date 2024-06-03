package Mobile_Test.Mobile_Test1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Launch {
	static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		openMobileapp();

	}
	
	public static void openMobileapp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(Mobile, cap);
		//cap.setCapability(MobileCapabilityType., "Nothing Phone (1)");
		cap.setCapability("udid", "P12278000659");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "14");
		cap.setCapability("automationName", "uiAutomator2");
		cap.setCapability("appPackage", "com.example.my_policy_app");
		cap.setCapability("appActivity", "com.example.my_policy_app.MainActivity");
		
		URL url = new URL("http://192.168.1.102:4723/");
		
		driver = new AppiumDriver(url,cap);
		
		
	}

}
