package AppTest;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.SupportsContextSwitching;

public class RealDeviceTest {
	
AppiumDriver driver;
	
	@BeforeTest
	public void beforetest() throws URISyntaxException, MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();

		
		dc.setCapability("platformName", "Android");
		dc.setCapability("deviceName", "samsung SM-M025F");
        dc.setCapability("app", "C:\\Users\\RESBEE-218\\Downloads\\Aaeb School.apk");
        dc.setCapability("newCommandTimeout", 60);
        dc.setCapability("chromedriverExecutable", "C:\\Users\\RESBEE-218\\Automation\\eclipse-workspace\\Mobile_App_Testing\\drivers\\chromedriver-win64 132\\chromedriver.exe");

        URI url= new URI("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(url.toURL(),dc);
        
        System.out.println("App launched successfully");
        
	}
	
	@Test
	public void test() throws InterruptedException
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement selectschool=wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Your school\"]")));
		selectschool.click();
		
		Thread.sleep(3000);
		WebElement search=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=' Search']"));
		search.click();
		search.sendKeys("iit");
		
		WebElement click=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='MAIN SCHOOL']"));
		click.click();
		
		Thread.sleep(3000);
		WebElement abaschool=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"IIT\"]"));
		abaschool.click();
		
		Thread.sleep(3000);
		WebElement yes=driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Yes']"));
		yes.click();
		
		
		Thread.sleep(5000);
		WebElement login=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Login']"));
		login.click();
		
		Thread.sleep(5000);
		
		Set<String> contextNames = ((SupportsContextSwitching) driver).getContextHandles();
		for (String contextName : contextNames) {
		    System.out.println("Available Context: " +contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		}
		
		for (String contextName : contextNames) {
	        if (contextName.contains("WEBVIEW")) {  // Identifies web view context
	            ((SupportsContextSwitching) driver).context(contextName);  // Switch to the web view context
	            break;
	        }
	    }
		Thread.sleep(3000);
		
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys("benil.resbee+33@gmail.com");
		
		w.until(ExpectedConditions.elementToBeClickable(By.id("SubmitBtn"))).click();
		
		Thread.sleep(2000);
		w.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys("iQYLQPvZ");
		
		w.until(ExpectedConditions.elementToBeClickable(By.id("continueBtn"))).click();
	
		
		

	}

}
