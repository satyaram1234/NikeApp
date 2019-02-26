package AaVinPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass {
	
	WebDriver driver;
	
//    String browser = "chrome";
//	String url = "http://www.google.com";
//	String userID= "Ramanna.satyaph@testNG.com";
	
		@Test()
		@Parameters({"browser","url","userID"})
		public void testNGDemo(String browser, String url, String userID){
	        if(browser.equals("chrome")){
				 String ChromeDriverPath = "C:\\Rammana_Wyn\\2019\\Selenium\\Sel Drivers\\chromedriver.exe";
				 System.setProperty("webdriver.chrome.driver",ChromeDriverPath);
				 driver= new ChromeDriver();
			     driver.get(url);
			     driver.findElement(By.linkText("Gmail")).click();
			     driver.findElement(By.linkText("SIGN IN")).click();
			     driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys(userID);
			     driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
			                               
	}
		}

}
