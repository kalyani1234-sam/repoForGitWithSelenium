package commonUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtils {

	public String getDataFrmPropertyFile(String keyName) throws IOException
	{
		FileInputStream fis = new FileInputStream("src\\test\\resources\\DWSdata1.properties");
		Properties ps = new Properties();
		ps.load(fis);
		String value = ps.getProperty(keyName);
		return value;
		
	}
	
	
	
}

