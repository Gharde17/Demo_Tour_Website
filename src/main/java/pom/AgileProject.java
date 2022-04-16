package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AgileProject {
	@FindBy(xpath = "//a[contains(.,'Agile Project')]")
	private WebElement agileprojectbtn;
	
	@FindBy(id="dismiss-button")
	private WebElement closebtn;
	
	@FindBy(xpath="/html/body/div/div/div[1]/div[1]/div/svg")
	private WebElement crossbtn;
	
	
	
	
	@FindBy(name ="uid")
	private WebElement userid1;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="btnLogin")
	private WebElement login;
	
	@FindBy(xpath = "//a[contains(.,'Log out')]")
	private WebElement logout;
	
	public AgileProject(WebDriver driver)
	{
	PageFactory.initElements(driver, this);

	}
	
	public void agileprojectbtn()
	{
		agileprojectbtn.click();
	}

	public void closeAdd()
	{
		closebtn.click();
	}
	public void crossbtn()
	{
		crossbtn.click();
	}
	
	
	public void userid(String userID)
	{
		userid1.sendKeys(userID);
	}
	
	public void password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void login()
	{
		login.click();
	}
	
	public void logout()
	{
		logout.click();
	}
}
