package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	
	
       public AndroidDriver driver;
       public Properties p;
	
	@BeforeTest
	public void beforetest() throws URISyntaxException, IOException
	{
		
		p =new Properties();
		FileReader fr=new FileReader("./src//test//resources//config.properties");
		p.load(fr);
		
		DesiredCapabilities dc= new DesiredCapabilities();

		String AppiumURL=p.getProperty("AppiumURL");
		
		
		dc.setCapability("platformName", "Android"); 
		dc.setCapability("deviceName", "emulator-5554");
        dc.setCapability("app", "C:\\Users\\RESBEE-218\\Downloads\\Aromal Testing.apk");
        dc.setCapability("newCommandTimeout", 300);
        dc.setCapability("chromedriverExecutable", "C:\\Users\\RESBEE-218\\Automation\\eclipse-workspace\\Mobile_App_Testing\\drivers\\chromedriver-win64 133\\chromedriver.exe");
        
        
        URI url= new URI(AppiumURL);
        driver= new AndroidDriver(url.toURL(),dc);
        
        System.out.println("App launched successfully");
        
	}

}
