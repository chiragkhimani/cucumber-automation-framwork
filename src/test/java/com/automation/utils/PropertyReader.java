package com.automation.utils;

import java.io.FileReader;
import java.util.Properties;

public class PropertyReader {

	static FileReader reader;
	static Properties prop;

	public static void initProperty() {
		try {
			reader = new FileReader("src//test//resources//config//config.properties");
			prop = new Properties();
			prop.load(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
