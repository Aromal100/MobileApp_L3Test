package pageObjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.SupportsContextSwitching;

public class LoginObjects extends Basepage {


	public LoginObjects(AndroidDriver driver) {
		super(driver);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"Select Your school\"]")
	WebElement selectschool;
	
	public void selectschool()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='Select Your school']"))).click();
		
		
	}
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=' Search']")
	WebElement search1;
	public void search1()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text=' Search']"))).click();
	}
	
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text=' Search']")
	WebElement search;
	public void search(String name)
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.EditText[@text=' Search']"))).sendKeys(name);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='MAIN SCHOOL']")
	WebElement clicks;
	public void clicks()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='MAIN SCHOOL']"))).click();
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text=\"IIT\"]")
	WebElement school;
	public void school()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text=\"IIT\"]"))).click();
	}
	
	@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc='Yes']")
	WebElement yes;
	public void yes()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.view.ViewGroup[@content-desc='Yes']"))).click();
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Login']")
	WebElement login;
	public void login()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//android.widget.TextView[@text='Login']"))).click();
	}
	
	public void contextname() throws InterruptedException
	{
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
		
    }
	@AndroidFindBy(id="email")
	WebElement email;
	public void email(String mail)
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("email"))).sendKeys(mail);
	}
	
	@AndroidFindBy(id="SubmitBtn")
	WebElement next;
	public void next()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("SubmitBtn"))).click();
	}
	
	@AndroidFindBy(id="password")
	WebElement pass;
	public void pass(String password)
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("password"))).sendKeys(password);
	}
	
	@AndroidFindBy(id="continueBtn")
	WebElement cont;
	public void cont()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.elementToBeClickable(By.id("continueBtn"))).click();
	}
	
	String xpath="//android.view.View[@resource-id=\"apexchartsoco5mi7mj\"]/android.view.View/android.view.View[1]/android.widget.Image";
	public void scroll()
	{
		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement scroll =w.until(ExpectedConditions.elementToBeClickable(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(" + xpath + ")")));
		scroll.click();

	}
	
}
