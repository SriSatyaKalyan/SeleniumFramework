package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseClass {
	
	public WebDriver driver; 
	
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\satya\\Desktop\\Eclipse Workspace\\SeleniumTraining\\Framework\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\satya\\Desktop\\Eclipse Workspace\\Selenium Software\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\satya\\Desktop\\Eclipse Workspace\\Selenium Software\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}else {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\satya\\Desktop\\Eclipse Workspace\\Selenium Software\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}
}
