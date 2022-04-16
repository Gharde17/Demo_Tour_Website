package genericLib;



import java.io.File;
import java.io.IOException;
import java.util.Date;




import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;



public class Photo {



public void getPhoto(WebDriver driver, String name) throws IOException
{
Date d = new Date();
String date = d.toString().replaceAll( ":","-");

TakesScreenshot ts = (TakesScreenshot) driver;
File src = ts.getScreenshotAs( OutputType.FILE);
File dest= new File(AutoConstant.photoPath+date+name+".png");
Files.copy(src, dest);

}
}