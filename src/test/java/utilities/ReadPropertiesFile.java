package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
		 FileReader fr = new FileReader("C:\\Users\\KARTHIK REDDY\\eclipse-workspace\\AutomationFramework\\src\\test\\resources\\configFiles\\config.properties");
		 Properties p = new Properties();
		 p.load(fr);
		 System.out.println(p.getProperty("browser"));
		 System.out.println(p.getProperty("testurl"));
		 
	}

}
