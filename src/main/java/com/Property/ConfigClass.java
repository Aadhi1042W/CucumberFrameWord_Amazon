package com.Property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigClass {

	public static Properties p;

	public ConfigClass() {

		File f = new File(
				"C:\\Users\\jayaa\\eclipse-workspace\\Greens\\IPT\\CucumberFramework\\src\\main\\java\\com\\Property\\ConfigutationReader.properties");
		try {
			FileInputStream fis = new FileInputStream(f);
			p = new Properties();
			p.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public String getAmazonURL() {
		String amazonURL=p.getProperty("amazonURL");
		return amazonURL;
	}

	public String getFacebookURL() {
		String facebookURL = p.getProperty("facebookURL");

		return facebookURL;
	}

	public String GetUsername() {
		String username = p.getProperty("username");

		return username;
	}

	public String GetvalidPassword() {
		String password = p.getProperty("password");

		return password;
	}

}
