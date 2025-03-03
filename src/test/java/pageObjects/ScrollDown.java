package pageObjects;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class ScrollDown extends Basepage {

	public ScrollDown(AndroidDriver driver) {
		super(driver);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Select Your school\"]")
	WebElement selectschool;
	
	public void selectschool()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='Select Your school']"))).click();	
		
	}
	
	  public void scrollToElementAndClick() {
	        String xpath = "//android.widget.TextView[@text='ABA School(test)']"; // XPath for the element
	        WebElement element = null;

	        // Loop until the element is found and clicked
	        while (element == null) {
	            try {
	            	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	                element = wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath(xpath)));
	                element.click();
	                
	                break; 
	            } catch (Exception e) {
	                scrolldown();
	            }
	        }
	    }
	
	
	public void scrolldown()
	{
		
		Dimension size = driver.manage().window().getSize();
		
		
		int startx=size.getWidth()/2;
		int starty=size.getHeight()/2;
		
		int endx=startx;
		int endy=(int)(size.getHeight()/4);
		
		PointerInput finger= new PointerInput(PointerInput.Kind.TOUCH,"finger");
		
		Sequence s=new Sequence(finger,1)
				.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startx,starty))
		        .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
		        .addAction(new Pause(finger, Duration.ofMillis(200)))
		        .addAction(finger.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(),endx,endy))
		        .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Collections.singletonList(s));
		
		
		
	}

}
