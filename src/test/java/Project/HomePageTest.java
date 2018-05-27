package Project;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.homepageObjects;
import resources.baseClass;

public class HomePageTest extends baseClass{
	
	@BeforeTest
	public void openBrowser() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("homepage"));
	}
	
	@Test
	public void titleTextValidation() {	
		homepageObjects objs = new homepageObjects(driver);
		String title_text = objs.getTitle().getText();
		System.out.println(title_text);
		
		Assert.assertEquals(title_text, "FEATURED COURSES");
	}
	
	@Test
	public void navbarPresent() {
		homepageObjects objs = new homepageObjects(driver);
		Assert.assertTrue(objs.getNavigationBar().isDisplayed());
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}