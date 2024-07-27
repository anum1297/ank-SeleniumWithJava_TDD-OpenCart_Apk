package com.OpenCart.testBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Logger log;
	
	
	@BeforeTest
	public void start() {
		Logger log = Logger.getLogger("Opencart Framework");
		PropertyConfigurator.configure("Log4j2.properties");
		log.info("Framework execution Started");
	}
	@AfterTest
	public void finish() {
		Logger log = Logger.getLogger("Opencart Framework");
		log.info("Framework execution Finished");
		log.info("------------------------------------------");

	}
		
	@BeforeMethod
	public void setUp() {
		Logger log = Logger.getLogger("Opencart Framework");
		log.info("Browser launches, url, waits, maximuze");

		String br = "Chrome";
		if(br.equalsIgnoreCase("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}else 
		if(br.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else 
		if(br.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			System.out.println("Please Provide correct browser name");
		}
		driver.get("https://naveenautomationlabs.com/opencart/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@AfterMethod
	public void tesrDown() throws InterruptedException {
		Logger log = Logger.getLogger("Opencart Framework");
		log.info("Browser Close");
		Thread.sleep(5000);
	    driver.quit();
	
	}


}
