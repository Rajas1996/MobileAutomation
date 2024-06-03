package Mobile_Test.Mobile_Test1;

import java.net.MalformedURLException;
import java.net.URL;
 
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Op;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppLaunch {

	public static void main(String[] args) {
		UiAutomator2Options options = new UiAutomator2Options();
        options.setUdid("P12278000659");
         
        options.setCapability("appium:appPackage", "com.example.my_policy_app");
        options.setCapability("appium:appActivity", "com.example.my_policy_app.MainActivity");
        options.setCapability("platformName", "Android");
        options.setCapability("appium:platformVersion", "14.0");
        options.setCapability("appium:automationName", "uiautomator2");
         
        try {
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



	}


