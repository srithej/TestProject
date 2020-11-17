package Elsevier;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


//import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

public class Elseviernewproject  {
	 WebDriver driver=null;
  @Test
public void elsevier() throws Exception {
	  driver.get("https://www.elsevier.com/en-in");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
	  Thread.sleep(3000);
	  WebElement sd=driver.findElement(By.xpath("a[contains(text(),'Shop & Discover')]"));
	  sd.click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//a[contains(text(),'Books and Journals')]")).click();
	  Thread.sleep(3000);
	  WebElement bj=driver.findElement(By.xpath("//a[contains(text(),'Books and Journals')]"));
	  bj.click();

  }
	  @Test
	  public void webshop() throws Exception {
		  
		  driver.findElement(By.xpath("//header/div[1]/nav[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		  Thread.sleep(3000);
		  
		  
		  
	  }
	  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void clicks() throws Exception {
	  WebElement sd=driver.findElement(By.xpath("a[contains(text(),'Shop & Discover')]"));
	  sd.click();
	  Thread.sleep(3000);
  }

  @BeforeClass
  public void invokeBrowser() throws Exception {
	  //System.out.println("Enter the Browser name: ");
	    //Scanner sc=new Scanner(System.in);
		//String browser=sc.nextLine();
	  String browser="chrome";
	  
		 if(browser.equals("chrome"))
			{
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			}
	    else
	    {
	    	 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
	    }
	 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




	  
  }

  @AfterClass
  public void close() {
	  driver.close();
	  
  }

}
