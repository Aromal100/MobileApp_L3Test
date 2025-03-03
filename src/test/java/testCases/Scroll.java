package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginObjects;
import pageObjects.ScrollDown;
import testBase.BaseClass;

public class Scroll extends BaseClass { 
	
	@Test
	public void testscroll() throws InterruptedException
	{
		LoginObjects lo=new LoginObjects(driver);
		lo.selectschool();
		ScrollDown sc= new ScrollDown(driver);
		sc.scrollToElementAndClick();
		
		
	}

}
