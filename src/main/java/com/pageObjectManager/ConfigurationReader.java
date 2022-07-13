package com.pageObjectManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public Properties p;
	
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\Admin\\Workspace\\CucumberProject\\configure.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
		
		}
	
	
	
	 public String getBrowserName() {
		 String browserName = p.getProperty("browserName");
		return browserName;
		 
	 }
	 
	 public String getdburl() {
		String url = p.getProperty("db_url");
		return url;

	}
	 
	 public String getUserName() {
		String username = p.getProperty("username");
        return username;
	}
	 public String getpassword() {
			String password = p.getProperty("password");
	        return password;
		}
	 
	 public String getfirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	 
	 public String getlastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	 
	 public String getaddress() {
		String address = p.getProperty("address");
		return address;
	}
	 
	 public String getcreditcardno() {
		String creditcardno = p.getProperty("creditcardno");
		return creditcardno;
	}
	 
	 public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
