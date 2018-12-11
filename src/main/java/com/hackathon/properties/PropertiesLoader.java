package com.hackathon.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLoader {

	public static Properties properties;

	public static Properties getInstance() {
		if (PropertiesLoader.properties == null) {
			try {
				PropertiesLoader.properties = new Properties();
				FileInputStream input = new FileInputStream(
						System.getProperty("user.dir") + "/src/main/java/com/hackathon/properties/json.properties");
				PropertiesLoader.properties.load(input);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return PropertiesLoader.properties;
	}
}
