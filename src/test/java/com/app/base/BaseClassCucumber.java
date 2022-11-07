package com.app.base;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassCucumber {

	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void sendKeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static WebElement findById(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement findByName(String Name) {
		return driver.findElement(By.name(Name));
	}

	public static WebElement fundByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static String propertiesFileReuse(String name) {
		String value = name;
		try {
			File f = new File(
					"C:\\Users\\ISAI\\eclipse-workspace\\CuCumberTest\\src\\test\\resources\\Test.properties\\sendkeys.properties");
			FileReader fr = new FileReader(f);
			Properties ps = new Properties();
			ps.load(fr);
			value = ps.getProperty(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	public static void threadSleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
