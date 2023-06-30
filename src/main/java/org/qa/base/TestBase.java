package org.qa.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	
	public static WebDriver driver;

	public static Properties prop;

	public static FileReader fr;

	public TestBase() throws IOException {

		fr = new FileReader(System.getProperty("user.dir") + "\\src\\main\\java\\org\\qa\\config\\config.properties");
		prop= new Properties();

		prop.load(fr);

	}

	public static void initialization() {
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(prop.getProperty("url"));
			
			
		}

	else if (prop .getProperty("browser").equalsIgnoreCase("firefox")) {
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(prop.getProperty("url"));
		
			
		}
	else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(prop.getProperty("url"));
			
	}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		}

		
		
		
	}
			
			
			
			
	
	
