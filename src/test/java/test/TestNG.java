package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestNG {
	public WebDriver driver;
  @Test
  public void  verifypageTitle() {
	  String pageTitle=driver.getTitle();
	  System.out.println(pageTitle);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://gmail.com/");
		 driver.manage().window().maximize();
		 
		 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
