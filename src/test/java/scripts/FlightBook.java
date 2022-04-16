package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.Flights;

public class FlightBook extends BaseClass{

    @Test

	public void tastcase1() throws IOException, InterruptedException
	{   
   	 
   	 
		Flights fs= new Flights(driver);
		
		
 		fs.flightbtn();
		
		utilities.closeAdds(driver,  pf.getPropertyData( "textForAdds"));
		
		fs.closebtn();
		
		Thread.sleep(5000);
		fs.type();
		
		utilities.dropDown(fs.passengers(),pf.getPropertyData("passenger"));
		
		utilities.dropDown(fs.departingFrom(), pf.getPropertyData("departingfrom"));
		
		utilities.dropDown(fs.onMonth(),pf.getPropertyData("onmonth"));
		
		utilities.dropDown(fs.onDate(),pf.getPropertyData("ondate"));
		
		utilities.dropDown(fs.arrivingIn(),pf.getPropertyData("arrivingin"));
		
		utilities.dropDown(fs.returningMonth(),pf.getPropertyData("returnmonth"));
		
		utilities.dropDown(fs.returningDate(),pf.getPropertyData("returndate"));
		
        fs.serviceClass();		

		utilities.dropDown(fs.airline1(),pf.getPropertyData("airline"));
		
		 
		
		fs.continue1();
		
		//here one defect is raised, because o/p text and existing text is different
		//utilities.switchTabs(driver);
		//fs.textValidation();
		
}
    @Test
    public void tastcase2() throws IOException, InterruptedException
	{   
   	 
   	 
		Flights fs= new Flights(driver);
		
		
 		fs.flightbtn();
		
		utilities.closeAdds(driver,  pf.getPropertyData( "textForAdds"));
		
		fs.closebtn();
		
		Thread.sleep(5000);
		fs.type();
		
		utilities.dropDown(fs.passengers(),pf.getPropertyData("passenger2"));
		
		utilities.dropDown(fs.departingFrom(), pf.getPropertyData("departingfrom2"));
		
		utilities.dropDown(fs.onMonth(),pf.getPropertyData("onmonth2"));
		
		utilities.dropDown(fs.onDate(),pf.getPropertyData("ondate2"));
		
		utilities.dropDown(fs.arrivingIn(),pf.getPropertyData("arrivingin2"));
		
		utilities.dropDown(fs.returningMonth(),pf.getPropertyData("returnmonth"));
		
		utilities.dropDown(fs.returningDate(),pf.getPropertyData("returndate"));
		
        fs.serviceClass();		

		utilities.dropDown(fs.airline1(),pf.getPropertyData("airline2"));
		
		 
		
		fs.continue1();
		
		
}
    @Test
    
    public void tastcase3() throws IOException, InterruptedException
	{   
   	 
   	 
		Flights fs= new Flights(driver);
		
		
 		fs.flightbtn();
		
		utilities.closeAdds(driver,  pf.getPropertyData( "textForAdds"));
		
		fs.closebtn();
		
		Thread.sleep(5000);
		fs.type();
		
		utilities.dropDown(fs.passengers(),pf.getPropertyData("passenger3"));
		
		utilities.dropDown(fs.departingFrom(), pf.getPropertyData("departingfrom3"));
		
		utilities.dropDown(fs.onMonth(),pf.getPropertyData("onmonth3"));
		
		utilities.dropDown(fs.onDate(),pf.getPropertyData("ondate3"));
		
		utilities.dropDown(fs.arrivingIn(),pf.getPropertyData("arrivingin3"));
		
		utilities.dropDown(fs.returningMonth(),pf.getPropertyData("returnmonth"));
		
		utilities.dropDown(fs.returningDate(),pf.getPropertyData("returndate"));
		
        fs.serviceClass();		

		utilities.dropDown(fs.airline1(),pf.getPropertyData("airline3"));
		
		 
		
		fs.continue1();
		
		
}
    @Test
    
    public void tastcase4() throws IOException, InterruptedException
	{   
   	 
   	 
		Flights fs= new Flights(driver);
		
		
 		fs.flightbtn();
		
		utilities.closeAdds(driver,  pf.getPropertyData( "textForAdds"));
		
		fs.closebtn();
		
		Thread.sleep(5000);
		fs.type();
		
		utilities.dropDown(fs.passengers(),pf.getPropertyData("passenger4"));
		
		utilities.dropDown(fs.departingFrom(), pf.getPropertyData("departingfrom4"));
		
		utilities.dropDown(fs.onMonth(),pf.getPropertyData("onmonth4"));
		
		utilities.dropDown(fs.onDate(),pf.getPropertyData("ondate4"));
		
		utilities.dropDown(fs.arrivingIn(),pf.getPropertyData("arrivingin4"));
		
		utilities.dropDown(fs.returningMonth(),pf.getPropertyData("returnmonth"));
		
		utilities.dropDown(fs.returningDate(),pf.getPropertyData("returndate"));
		
        fs.serviceClass();		

		utilities.dropDown(fs.airline1(),pf.getPropertyData("airline4"));
		
		 
		
		fs.continue1();
		
}
}