package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flights {

	@FindBy(xpath="//a[text()='Flights']")
	private WebElement flightsbtn;
	
	@FindBy(id="dismiss-button")
	private WebElement closebtn;

	@FindBy(name ="tripType")
	private WebElement type1;

	@FindBy(xpath="//select[@name='passCount']")
	private WebElement passengers;

	@FindBy(name = "fromPort")
	private WebElement departingFrom;

	@FindBy(xpath="//select[@name='fromMonth']")
	private WebElement onMonth;

	@FindBy(xpath = "//select[@name='fromDay']")
	private WebElement onDate;

	@FindBy(name="toPort")
	private WebElement arrivingIn;

	@FindBy(name="toMonth")
	private WebElement returningMonth;

	@FindBy(name="toDay")
	private WebElement returningDate ;

	@FindBy(xpath = "(//font)[22]//input[@value='First']")
	private WebElement serviceClass1;

	@FindBy(xpath = "//select[@name='airline']")
	private WebElement airline;



	@FindBy( name="findFlights")
	private WebElement continuee;
	
	@FindBy(xpath = "(//font[@face='Arial, Helvetica, sans-serif'])[2]//font[1]")
	private WebElement textvalidation;

	public Flights(WebDriver driver)
	{
	PageFactory.initElements(driver, this);

	}


	public void flightbtn()
	{
	 flightsbtn.click();
	}
	
	public void closebtn()
	{
		closebtn.click();
	}

	public void type()
	{
	type1.click();
	}

	public WebElement passengers()
	{
	 return passengers;
	}

	public WebElement departingFrom()
	{
	 return departingFrom;
	}

	public WebElement onMonth()
	{
		return onMonth;
	}

	public  WebElement onDate()
	{
		return onDate;
	}

	public  WebElement arrivingIn()
	{
		return arrivingIn;
	}

	public WebElement returningMonth()
	{
		return returningMonth ;
	}

	public  WebElement returningDate()
	{
		return returningDate ;
	}

	public void serviceClass()
	{
		serviceClass1.click();
	}

	public WebElement airline1()
	{
	return airline;
	}

	public void continue1()
	{
	continuee.click();
	}
	
	public void textValidation()
	{
		 
		String actualtext = textvalidation.getText();
 		
		String expectextext ="        After flight finder - No Seats Avaialble  ";
		
		if(actualtext.equals(expectextext))
		{
			System.out.println("text is same : " +actualtext);
		}
		else
			System.out.println("text is not same :" +actualtext);
		
	}
	
	
	
	
}