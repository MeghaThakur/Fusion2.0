package com.hackathon;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.hackathon.bean.Data;
import com.hackathon.bean.FormObjectMapper;
import com.hackathon.properties.PropertiesLoader;

public class BaseSetup {

	public static boolean hasQuit = true;
	public static WebDriver driver;
	public static Properties properties;
	public static Data[] dataArray;

	public BaseSetup() {
		BaseSetup.properties = PropertiesLoader.getInstance();
	}

	@SuppressWarnings("deprecation")
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:/swdtools/chromedriver_win32/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--incognito");
		BaseSetup.driver = new ChromeDriver(chromeOptions);
		FormObjectMapper obj = new FormObjectMapper();

		BaseSetup.driver.manage().deleteAllCookies();
		try {
			dataArray = obj.ReadJsonWithObjectMapper();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BaseSetup.driver.get("file:///C:/Users/Utkarsh/Documents/workspacests/selenium/FusionForm.html");
		// BaseSetup.driver.get(BaseSetup.properties.getProperty("url"));

	}

}
