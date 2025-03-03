package AppTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class PhoneDialerTest {

	AppiumDriver driver;
	
	@BeforeTest
	public void beforetest() throws URISyntaxException, MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();

		
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("appPackage", "com.android.calculator2"); 
        dc.setCapability("appActivity", "com.android.calculator2.Calculator"); 
        //dc.setCapability("app", "C:\\Users\\RESBEE-218\\Downloads\\AaebSchool.apk");
        
        URI url= new URI("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(url.toURL(),dc);
        
        System.out.println("App launched successfully");
        
	}
	
	@Test
	public void test() throws InterruptedException
	{
      
		WebElement one=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_1']"));
		one.click();
		WebElement zero1=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_0']"));
		zero1.click();
		WebElement zero2=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_0']"));
		zero2.click();
		//android.widget.Button[@content-desc="plus"]
		WebElement plus=driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='plus']"));
		plus.click();
		WebElement one1=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_1']"));
		one1.click();
		WebElement zero3=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_0']"));
		zero3.click();
		WebElement zero4=driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_0']"));
		zero4.click();
		//android.widget.Button[@content-desc="equals"]
		WebElement equal=driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc='equals']"));
		equal.click();

	}
	
	
	
}
