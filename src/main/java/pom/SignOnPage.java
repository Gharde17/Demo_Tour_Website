package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOnPage {

	@FindBy(xpath = "//a[text()='SIGN-ON']")
	private WebElement signonbtn;
	

	@FindBy(id="dismiss-button")
	private WebElement closebtn;

	
	@FindBy (name = "userName")
	private WebElement un;
	
	@FindBy(name = "password")
	private WebElement pwd;
	
	@FindBy (name = "submit")
	private WebElement subbtn;
	
	@FindBy(xpath = "//h3[text()='Login Successfully']")
	private WebElement textValidation;
	
	public SignOnPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signBtn()
	{
		signonbtn.click();
	}
	
	public void closeBtn()
	{
		closebtn.click();
	}
	
	public void userName(String name)
	{
		un.sendKeys(name);
	}
	
	public void password(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void submitBtn()
	{
		subbtn.click();
	}
	
	
	public void textvalidation()
	{
		 
		String actualtext = textValidation.getText();
 		System.out.println(actualtext);
		String expectextext ="Login Successfully";
		
		if(actualtext.equals(expectextext))
		{
			System.out.println("text is same : " +actualtext);
		}
		else
			System.out.println("text is not same :" +actualtext);
		
	}
	
	
	
	
	
}