package pageObjects;


import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;

public class Basepage  {
	
  AndroidDriver driver;
	
	public Basepage(AndroidDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


}
