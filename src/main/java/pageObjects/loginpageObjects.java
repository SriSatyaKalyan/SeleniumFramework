package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class loginpageObjects {
	
	public WebDriver driver;
	
	By emailBox    = By.xpath("//input[@type='email']");
	By passwordBox = By.xpath("//input[@type='password']");
	By loginButton = By.xpath("//input[@type='submit']");
	
	public loginpageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement emailId() {
		return driver.findElement(emailBox);
	}
	
	public WebElement passwordId() {
		return driver.findElement(passwordBox);
	}
	
	public WebElement clickLogin() {
		return driver.findElement(loginButton);
	}
	

	
}
