package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class TestBase {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Said\\eclipse-workspace2\\Xml.DataDriven\\src\\main\\java\\Util\\conf.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("Browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Said\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "/Users/shukhratfayziev/Downloads/BrowserDrivers/geckodriver");
			driver = new FirefoxDriver();
			
			
		}else if(browserName.equals("safari")) {
			System.setProperty("webdriver.ie.driver", "");
			driver = new SafariDriver();
			
		}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	
	}
	
}
