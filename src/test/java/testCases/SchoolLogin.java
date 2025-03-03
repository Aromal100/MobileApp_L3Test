package testCases;



import org.testng.annotations.Test;

import pageObjects.LoginObjects;
import testBase.BaseClass;

public class SchoolLogin extends BaseClass {
	
	@Test
	public void test() throws InterruptedException
	{
		 
		
		LoginObjects lo=new LoginObjects(driver);
		lo.selectschool();
		lo.search1();
		lo.search("iit");
		lo.clicks();
		lo.school();
		lo.yes();
		lo.login();
		lo.contextname();
		lo.email("benil.resbee+33@gmail.com ");
		lo.next();
		lo.pass("Sujin@123");
		lo.cont();
		lo.scroll();
		
		
	
		
		

	}

}
