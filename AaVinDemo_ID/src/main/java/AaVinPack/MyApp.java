package AaVinPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class MyApp {
	
	
	/** 
	 * Instantiate the DesiredCapabilities class
	 * set the properties/define Mobile App
	 * Device details
	 * .apk/app details - APP_PACKAGE 
	 * APP_ACTIVITY
	 * ....next
	 * Instantiate RemoteWeb Drive 
	 * 
	 
	 */
	DesiredCapabilities dCap = new DesiredCapabilities();
	
	@Test
	public void runMytestOnAndroid() throws MalformedURLException   {
		
		dCap.setCapability("Browser","Android");
		dCap.setCapability(AndroidMobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		dCap.setCapability(MobileCapabilityType.DEVICE_NAME, "MyAndroid");
		dCap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.caliculator2");		
		dCap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.caliculator2.Caliculator");
		
	//	//Establish connection with remote Instance/Remote Hub - Appium:		
	WebDriver remoteWebDriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),dCap);
	
	remoteWebDriver.findElement(By.name("2")).click();
	remoteWebDriver.findElement(By.name("+")).click();
	remoteWebDriver.findElement(By.name("7")).click();
	remoteWebDriver.findElement(By.name("=")).click();
		
				
	}
	
}
