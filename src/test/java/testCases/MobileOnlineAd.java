package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageObjects.mobileOnlineAdmission;
import testBase.BaseClass;

public class MobileOnlineAd extends BaseClass  {
	
	@Test
	public void test() throws InterruptedException, IOException
	{
		Faker f=new Faker();
		String firstname=f.name().firstName();
		String middlename=f.name().firstName();
		String lastname=f.name().lastName();
		String motherName = f.name().firstName();
		String mmother=f.name().firstName();
		String lmother=f.name().lastName();
		String parentFirstName = f.name().firstName();
	    String parentMiddleName = f.name().firstName();
	    String parentLastName = f.name().lastName();
	    String mail=f.internet().emailAddress();
	    String phone ="9"+ f.phoneNumber().subscriberNumber(8);
		
		
		mobileOnlineAdmission on= new mobileOnlineAdmission(driver);
		on.selectschool();
		on.search1();
		on.search("aba");
		on.clicks();
		on.school();
		on.yes();
		on.admission();
		on.proceed();
		on.switchToWebView();
		on.program();
		on.grade();
		on.profilepic();
		on.Firstname(firstname);
		on.midname(middlename);
		on.lastname(lastname);
		on.gender();
		on.dob();
		on.mothername(motherName);
		on.mmother(mmother);
		on.lmother(lmother);
		on.commencement();
		on.language();
		on.birthcertificate();
		on.reportcardfile();
		on.subcity();
		on.birthworeda();
		on.currentsubcity();
		on.currentworeda();
		on.houseno("10");
		on.phone(phone);
		on.email(mail);
		on.fparentname(parentFirstName);
		on.mparentname(parentMiddleName);
		on.lparentname(parentLastName);
		on.profilepic2();
		on.parentgender();
		on.parentmaritalstatus();
		on.parentphno(phone);
		on.parentid();
		on.checkBox();
		on.paymentmethod();
		on.applybutton();	
		
		
		
		
	}

}
