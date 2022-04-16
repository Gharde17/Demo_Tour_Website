package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {


@FindBy(xpath="//a[text()='REGISTER']")
private WebElement registerbtn;

@FindBy(name="firstName")
private WebElement firstname;

@FindBy(name = "lastName")
private WebElement lastname;

@FindBy(name = "phone")
private WebElement phone;

@FindBy(xpath="//input[@id='userName']")
private WebElement email;



@FindBy(name="address1")
private WebElement address;



@FindBy(name="city")
private WebElement city;




@FindBy(name="state")
private WebElement state;



@FindBy(name="postalCode")
private WebElement postalCode;




@FindBy(name="country")
private WebElement country;




@FindBy( id="email")
private WebElement userName;



@FindBy( name="password")
private WebElement password;

@FindBy( name="confirmPassword")
private WebElement confirmPassword;

@FindBy( name="submit")
private WebElement submit;

@FindBy(xpath = "(//font[contains(@face,'Arial, Helvetica, sans-serif')])[3]")
private WebElement textValidation;

@FindBy(xpath = "//span[contains(.,'PAssword and con.password does not match')]")
private WebElement doesnotmatch;


public HomePage(WebDriver driver)
{
PageFactory.initElements(driver, this);

}


public void registerButton()
{
registerbtn.click();
}

public void firstName(String fname)
{
firstname.sendKeys(fname);
}

public void lastName(String lname)
{
lastname.sendKeys(lname);
}

public void phoneNumber(String phnum)
{
phone.sendKeys( phnum);
}

public void emailAddress(String emailad)
{
email.sendKeys( emailad);
}

public void address(String addresss)
{
address.sendKeys( addresss);
}

public void city(String cityad)
{
city.sendKeys(cityad);
}

public void state(String statead)
{
state.sendKeys( statead);
}

public void postalCode(String postcode)
{
postalCode.sendKeys( postcode);
}

public WebElement country()
{
return country;
}

public void username(String un)
{
userName.sendKeys(un);
}

public void password(String pwd)
{
password.sendKeys(pwd);
}

public void confirmPwd(String cpwd)
{
confirmPassword.sendKeys(cpwd);
}

public void submit()
{
submit.click();
}
public void textValidation()
{
	textValidation.getText();
}
public void doesnotmatch()
{
	doesnotmatch.getText();
}
}
