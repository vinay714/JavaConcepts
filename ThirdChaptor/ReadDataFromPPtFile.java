package ThirdChaptor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPPtFile {

	public static void main(String[] args) throws IOException {
		// step 1 : we have to convert physical file in to java readable object
		// FileInputStream() throws FileNotFoundException

		FileInputStream fil = new FileInputStream("./TestResources/CommonData.properties");

		// step 2 create an instance of properties object
		// properties object should be imported from java.util package
		Properties property = new Properties();

		// step 3 load all the key value pairs into properties object
		// the below statment throw IOException
		property.load(fil);

		// step 4 fratch value using key
		String url = property.getProperty("url");
		String browser = property.getProperty("browser");
		String user = property.getProperty("username");
		String pwd = property.getProperty("password");
		System.out.println(property.getProperty("url"));

		System.out.println(url + "\n" + browser + "\n" + user + "\n" + pwd);

	}

}
