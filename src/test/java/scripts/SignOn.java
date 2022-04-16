package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pom.SignOnPage;

public class SignOn extends BaseClass {

	@Test
	public void validData() throws IOException, InterruptedException
	{
 		SignOnPage sp = new SignOnPage(driver);
 		
		sp.signBtn();
		
		utilities.closeAdds(driver,  pf.getPropertyData( "textForAdds"));
        sp.closeBtn();
        
        Thread.sleep(3000);
        
		sp.userName(pf.getPropertyData( "name"));
		sp.password( pf.getPropertyData( "password"));
		
		sp.submitBtn();
		
		utilities.switchTabs(driver);
		sp.textvalidation();
		
	}
	@Test
	public void invalidData() throws IOException, InterruptedException
	{
 		SignOnPage sp = new SignOnPage(driver);
 		
		sp.signBtn();
		
		utilities.closeAdds(driver,  pf.getPropertyData( "textForAdds"));
        sp.closeBtn();
        
        Thread.sleep(3000);
        
		sp.userName(pf.getPropertyData( "name2"));
		sp.password( pf.getPropertyData( "password2"));
		
		sp.submitBtn();
		
		utilities.switchTabs(driver);
		sp.textvalidation();
		
		
	}
	@Test
	public void blankData() throws IOException, InterruptedException
	{
 		SignOnPage sp = new SignOnPage(driver);
 		
		sp.signBtn();
		
		utilities.closeAdds(driver,  pf.getPropertyData( "textForAdds"));
        sp.closeBtn();
        
        Thread.sleep(3000);
        
		sp.userName(pf.getPropertyData( "name3"));
		sp.password( pf.getPropertyData( "password3"));
		
		sp.submitBtn();
		
		utilities.switchTabs(driver);
		sp.textvalidation();
		
		
	}
}