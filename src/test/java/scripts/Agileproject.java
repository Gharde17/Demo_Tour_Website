package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.AgileProject;

  public class Agileproject extends BaseClass{
	
	@Test
	public void vaildData() throws IOException, InterruptedException
	{   
   	 
   	 
		AgileProject AP= new AgileProject(driver);
		AP.agileprojectbtn();
		
		utilities.closeAdds(driver,pf.getPropertyData( "textForAdds"));
		AP.closeAdd();
		AP.crossbtn();
		Thread.sleep(3000);
	    AP.userid(pf.getPropertyData("userI1"));
		
		AP.password(pf.getPropertyData("Pwd1"));
		
		AP.login();
		//AP.logout();
		

}

	@Test
	public void invaildData() throws IOException, InterruptedException
	{   
   	 
   	 
		AgileProject AP= new AgileProject(driver);
		AP.agileprojectbtn();
		
		utilities.closeAdds(driver,pf.getPropertyData( "textForAdds"));
		AP.closeAdd();
		AP.crossbtn();
		
		
		Thread.sleep(3000);
	    AP.userid(pf.getPropertyData("userID2"));
		
		AP.password(pf.getPropertyData("Pwd2"));
		
		AP.login();
		//AP.logout();
		

}

	@Test
	public void blankData() throws IOException, InterruptedException
	{   
   	 
   	 
		AgileProject AP= new AgileProject(driver);
		AP.agileprojectbtn();
		
		utilities.closeAdds(driver,pf.getPropertyData( "textForAdds"));
		AP.closeAdd();
		AP.crossbtn();
		
		
	    
		Thread.sleep(3000);
	    AP.userid(pf.getPropertyData("userID3"));
		
		AP.password(pf.getPropertyData("Pwd3"));
		
		AP.login();
		//AP.logout();
		

}
}

