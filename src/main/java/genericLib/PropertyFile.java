package genericLib;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class PropertyFile implements AutoConstant {



public String getPropertyData(String key) throws IOException
{
Properties p = new Properties();

FileInputStream fis = new FileInputStream(propertyFilePath);
p.load(fis);
return p.getProperty(key);

}
}