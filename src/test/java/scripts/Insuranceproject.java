package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.InsuranceProject;

public class Insuranceproject extends BaseClass {
	
	 @Test

		public void tastcase1() throws IOException, InterruptedException
		{   
	   	 
	   	 InsuranceProject IP= new InsuranceProject(driver);
	   	 
	   	 IP.insuranceprojectbtn();
	   	 utilities.closeAdds(driver, pf.getPropertyData("textForAdds"));
	   	 IP.closeAdd();
	   	 
	   	 Thread.sleep(3000);
	   	 
	   	 IP.registerbtn();
	   	 IP.title1();
	   	 IP.firstname(pf.getPropertyData("firstname"));
	   	IP.lastname1(pf.getPropertyData("lastname"));
	   	IP.phoneNum(pf.getPropertyData("phonenumber"));
	   	
	   	
	   	utilities.dropDown(IP.dobYear(),pf.getPropertyData("dobYear"));
		utilities.dropDown(IP.dobMonth(),pf.getPropertyData("dobMonth"));
		
		utilities.dropDown(IP.dobDate(),pf.getPropertyData("dobDate"));
		IP.licencetype();
		
		utilities.dropDown(IP.licenceperiod(),pf.getPropertyData("licenceperiod"));
		
		utilities.dropDown(IP.occupation1(),pf.getPropertyData("occupation1"));
		
		IP.street(pf.getPropertyData("Addressstreet"));
		IP.city(pf.getPropertyData("city"));
		IP.country(pf.getPropertyData("country"));
		IP.postcode(pf.getPropertyData("postcode"));
		IP.email(pf.getPropertyData("email"));
		IP.password(pf.getPropertyData("password"));
		IP.confirmpassword(pf.getPropertyData("confirmpassword"));
		IP.create();
		
		IP.Email(pf.getPropertyData("login-email"));
		IP.Password(pf.getPropertyData("login-password"));
		IP.login();
		//IP.logout();
		
		
	   	 
	   	 
	  }
}