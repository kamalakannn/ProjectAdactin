package com.PropertyManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileReader {

	public static Properties p;

	public FileReader() throws Throwable {

		File f = new File("E:\\Hotel\\src\\main\\java\\com\\Properties\\PropertyFile.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);

	}

	public String getURL() {
		String url = p.getProperty("url");
		// System.out.println(url);
		return url;
	}

	public String getUser() {
		String user = p.getProperty("username");
		// System.out.println(user);
		return user;
	}

	public String getPass() {
		String pass = p.getProperty("password");
		// System.out.println(pass);
		return pass;

	}

}
