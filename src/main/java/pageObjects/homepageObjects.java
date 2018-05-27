package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageObjects {
	
	public WebDriver driver;
	By loginbutton = By.cssSelector("a[href*='sign_in']");
	By title       = By.xpath("//*[@id=\"content\"]/div/div/h2");
	By navigationbar = By.xpath("//nav[@class='navbar-collapse collapse']");
	
	public homepageObjects(WebDriver driver) {
	// TODO Auto-generated constructor stub
		this.driver = driver;		
	}
	
	public WebElement getLogin() {
		return driver.findElement(loginbutton);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getNavigationBar() {
		return driver.findElement(navigationbar);
	}

}
