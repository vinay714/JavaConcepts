package ThirdChaptor;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class pract {
	public static void main(String[] args) throws IOException  {
		
		FileInputStream fil = new FileInputStream("C:\\Users\\Vinay Kumar G S\\Desktop\\cred.properties");
		Properties ppty = new Properties();
		ppty.load(fil);
		
		
		
		System.out.println(ppty.getProperty("url"));
		System.out.println(ppty.getProperty("browser"));
		System.out.println(ppty.getProperty("timeouts"));
		System.out.println(ppty.getProperty("username"));
		
	}

}
