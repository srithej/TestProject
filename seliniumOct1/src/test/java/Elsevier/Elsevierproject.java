package Elsevier;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Elsevierproject  {
  private Object driver;

@Test
  public void Elsevier()throws Exception {
  ((RemoteWebDriver) driver).get("https://www.elsevier.com/en-in");
  Thread.sleep(3000);
  


  }
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Enter the Browser name: ");
	    Scanner sc=new Scanner(System.in);
		String browser=sc.nextLine();
	    if(browser.contains("chrome"))
		{
	    	 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriverInfo();
		}
	    else
	    {
	    	 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
	    }
	 
		 ((RemoteWebDriver) driver).manage().window().maximize();
		 ((RemoteWebDriver) driver).manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
  }

}
