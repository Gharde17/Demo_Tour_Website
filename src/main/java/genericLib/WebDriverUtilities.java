package genericLib;



import java.util.Set;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class WebDriverUtilities {



public void dropDown(WebElement ele , String text)
{
Select s = new Select(ele);
s.selectByVisibleText(text);
}

public void mouseHower(WebDriver driver , WebElement ele)
{
Actions a = new Actions( driver);
a.moveToElement(ele).perform();

}

public void doubleClick(WebDriver driver, WebElement ele)
{
Actions a = new Actions( driver);
a.doubleClick(ele).perform();
}


public void switchFrame(WebDriver driver, String string)
{
driver.switchTo().frame(0);
}

public void switchBack(WebDriver driver)
{
driver.switchTo().defaultContent();
}

public void alertPopUpOk(WebDriver driver)
{
driver.switchTo().alert().accept();
}

public void alertPopUpCancel(WebDriver driver)
{
driver.switchTo().alert().dismiss();
}

public void switchTabs(WebDriver driver)
{
Set<String> child = driver.getWindowHandles();
for(String b: child) {
driver.switchTo().window(b);
}
}

public void scrollBar(WebDriver driver, int x, int y)
{
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("window.scrollBy("+x+","+y+")");

}

public void closeAdds(WebDriver driver, String text) {
	driver.switchTo().frame(text);
	driver.switchTo().frame(0);
	
}


}