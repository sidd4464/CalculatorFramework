package com.calculator.test.CalculatorFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CalculatorSetup { 
	//Initialization of WebDriver 
	public static WebDriver driver;
	public static Properties prop ;
	public static FileInputStream fis;
	public static String browser;
	public static String url; 
	
	@BeforeSuite
	public void setUp() throws IOException { 
		
	
	
		 prop =readPropertiesFile("essentials.properties");
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		
			System.setProperty("webdriver.chrome.driver", "F:\\CalculatorFramework\\CalculatorFramework\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url); 
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
	}
	
	@AfterSuite
	public void closeDriver() {
		
		
		driver.quit();
	} 
	public static Properties readPropertiesFile(String fileName) throws IOException {
	      FileInputStream fis = null;
	      Properties prop = null;
	      try {
	         fis = new FileInputStream(fileName);
	         prop = new Properties();
	         prop.load(fis);
	      } catch(FileNotFoundException fnfe) {
	         fnfe.printStackTrace();
	      } catch(IOException ioe) {
	         ioe.printStackTrace();
	      } finally {
	         fis.close();
	      }
	      return prop;
	   }
	
	

}


