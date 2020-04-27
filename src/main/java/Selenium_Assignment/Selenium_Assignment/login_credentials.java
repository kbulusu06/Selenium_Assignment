package Selenium_Assignment.Selenium_Assignment;

import java.io.FileInputStream;
import java.util.Properties;

public class  login_credentials {
	public static void main(String[] args) {
	
	String spath=System.getProperty("user.dir")+"/credentials.properties";{
	try {
	Properties prop=new Properties();
	FileInputStream fi=new FileInputStream(spath);
	prop.load(fi);
	System.getProperties().putAll(prop);
	System.out.println(System.getProperty("Username"));
	System.out.println(System.getProperty("Password"));
	
	
	
	}catch(Exception a) {
		System.out.println(a);
	}
}
}
}

