package com.test.seliniumOct1;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaveenDemo {
	
	 static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	


		WebDriverManager.firefoxdriver().setup();
		
		 driver =new FirefoxDriver(); 
		 driver.get("https://www.google.com/");
		 
		 
 

	}

}
