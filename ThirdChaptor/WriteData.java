package ThirdChaptor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteData {

	public static void main(String[] args) throws IOException {
		// step 1 convert physical file into javareadable formate
		FileInputStream fil = new FileInputStream("TestResources/CommonData.properties");

		// step 2 create instance of property class
		Properties ppty = new Properties();

		// step 3 Lode all key value pair into properties object
		ppty.load(fil);

		// OU+step 4 write data into properties file 
		ppty.put("OS", "Windows");

		// step 5 save chanes in properties file
		FileOutputStream fos = new FileOutputStream("TestResources/CommonData.properties");
		ppty.store(fos, "update sucessfully");

	}

}
