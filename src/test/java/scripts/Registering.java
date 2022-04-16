package scripts;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.HomePage;


	
	public class Registering extends BaseClass {


		@Test

		
		public void validData() throws IOException
	{
	HomePage hm = new HomePage(driver);
	hm.registerButton();
	hm.firstName(pf.getPropertyData("fn"));
	hm.lastName(pf.getPropertyData("ln"));
	hm.phoneNumber(pf.getPropertyData("phone"));
	hm.emailAddress( pf.getPropertyData( "email"));
	hm.address( pf.getPropertyData( "address"));
	hm.city(pf.getPropertyData( "city"));
	hm.state( pf.getPropertyData( "state"));
	hm.postalCode( pf.getPropertyData( "postalcode"));


	utilities.dropDown(hm.country(),pf.getPropertyData( "country"));
     

	hm.username( pf.getPropertyData( "un"));
	hm.password( pf.getPropertyData( "password"));
	hm.confirmPwd( pf.getPropertyData( "confirmationpwd"));

	hm.submit();

	

	}
		@Test
		public void invalidData() throws IOException, InterruptedException
		{	
			HomePage hm = new HomePage(driver);
			hm.registerButton();
			hm.firstName(pf.getPropertyData("fn"));
			hm.lastName(pf.getPropertyData("ln"));
			hm.phoneNumber(pf.getPropertyData("phone"));
			hm.emailAddress( pf.getPropertyData( "email"));
			hm.address( pf.getPropertyData( "address"));
			hm.city(pf.getPropertyData( "city"));
			hm.state( pf.getPropertyData( "state"));
			hm.postalCode( pf.getPropertyData( "postalcode"));


			utilities.dropDown(hm.country(),pf.getPropertyData( "country"));
		     

			hm.username( pf.getPropertyData( "un"));
			hm.password( pf.getPropertyData( "password"));
			hm.confirmPwd( pf.getPropertyData( "confirmationpwd2"));

			hm.submit();
			Thread.sleep(3000);
		}
		
	}