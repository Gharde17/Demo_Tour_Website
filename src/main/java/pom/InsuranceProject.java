package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsuranceProject {
	@FindBy(xpath = "//a[contains(.,'Insurance Project')]")
	private WebElement insuranceprojectbtn;
	
	@FindBy(xpath = "//a[contains(.,'Register')]")
	private WebElement registerbtn;
	
	@FindBy(id="dismiss-button")
	private WebElement closebtn;
	
	@FindBy(xpath = "//select[@name='title']")
	private WebElement title;


	@FindBy(name="firstname")
	private WebElement firstName;
	

	@FindBy(name="lastname")
	private WebElement lastName;
	

	@FindBy(name="phone")
	private WebElement phoneNum;
	

	@FindBy(name="year")
	private WebElement dobYear;
	

	@FindBy(name="month")
	private WebElement dobMonth;
	
	@FindBy(name="date")
	private WebElement dobDate;
	
	
	@FindBy(name="licencetype")
	private WebElement licencetype;
	
	
	@FindBy(name="licenceperiod")
	private WebElement licenceperiod;
	
	
	@FindBy(name="occupation")
	private WebElement occupation1;
	
	@FindBy(name="street")
	private WebElement street;
	
	@FindBy(name="city")
	private WebElement city1;
	
	@FindBy(name="county")
	private WebElement country1;
	
	@FindBy(name="post_code")
	private WebElement postcode1;
	
	@FindBy(name="email")
	private WebElement email1;
	
	
	@FindBy(name="password")
	private WebElement password1;
	
	
	@FindBy(id="user_user_detail_attributes_password_confirmation")
	private WebElement confirmpassword;
	
	
	@FindBy(xpath = "(//input[@class='btn btn-default'])[2]")
	private WebElement create;
	

	@FindBy(name="email")
	private WebElement loginemail;
	
	

	@FindBy(name="password")
	private WebElement loginpassword;
	

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement login;
	
	
	@FindBy(xpath = "//input[@value='Log out']")
	private WebElement logout;
	
	
	public InsuranceProject(WebDriver driver)
	{
	PageFactory.initElements(driver, this);

	}
	
	public void insuranceprojectbtn()
	{	
		insuranceprojectbtn.click();
	}
	
	
	public void closeAdd()
	{
		closebtn.click();
	}
	
	public void registerbtn()
	{
	  registerbtn.click();	
	}
	
	
	
	public WebElement title1()
	{
		return title;
	}
	
	public void firstname(String fn)
	{
		firstName.sendKeys(fn);
	}
	
	public void lastname1(String ln)
	{
		lastName.sendKeys(ln);
	}
	
	public void phoneNum(String phone)
	{
		phoneNum.sendKeys(phone);
	}
	
	
	public WebElement dobYear()
	{
		return dobYear;
		}
	
	
	public WebElement dobMonth()
	{
		return dobMonth;
	}
	
	
	public WebElement dobDate()
	{
		return dobDate;
	}
	
	
	public void licencetype()
	{
		licencetype.click();
	}
	
	
	public WebElement licenceperiod()
	{
		return licenceperiod;
	}
	
	
	public WebElement occupation1()
	{
		return occupation1;
	}
	
	
	public void street(String addressStreet)
	{
	 street.sendKeys(addressStreet);
	}
	
	
	public void city(String city)
	{
	 city1.sendKeys(city);
	}
	
	
	public void country(String country)
	{
	 country1.sendKeys(country);
	}
	
	
	public void postcode(String pincode)
	{
		postcode1.sendKeys(pincode);
	}
	
	
	public void email(String email)
	{
		email1.sendKeys(email);
	}
	
	
	public void password(String pwd)
	{
		password1.sendKeys(pwd);
	}
	
	
	
	public void confirmpassword(String cpwd)
	{
		confirmpassword.sendKeys(cpwd);
	}
	
	
	public void create() 
	{
		create.click();
	}
	
	public void Email(String email)
	{
		loginemail.sendKeys(email);
	}
	
	public void Password(String pwd)
	{
		loginpassword.sendKeys(pwd);
	}
	public void login()
	{
		login.click();
	}
	
	public void logout()
	{
		logout.click();;
	}
	
	
	
}
