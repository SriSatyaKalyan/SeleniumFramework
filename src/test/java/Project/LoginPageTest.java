package Project;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.homepageObjects;
import pageObjects.loginpageObjects;
import resources.baseClass;

public class LoginPageTest extends baseClass {
	
	@BeforeTest
	public void openBrowser() throws IOException {
		driver = intializeDriver();
		driver.get(prop.getProperty("loginpage"));
	}
//		
//	@Test
//	public void loginButton() {	
//		homepageObjects objs = new homepageObjects(driver);
//		objs.getLogin().click();
//	}

	@Test(dataProvider = "getData")
	public void enterLogin(String username, String password, String text) throws IOException {
		driver.navigate().refresh();
		
		loginpageObjects objs2 = new loginpageObjects(driver);
		System.out.println(text);
		objs2.emailId().clear();
		objs2.emailId().sendKeys(username);
		objs2.passwordId().clear();
		objs2.passwordId().sendKeys(password);
		objs2.clickLogin().click();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object data[][] = new Object[2][3];
		
		//1st row
		data[0][0]      = "pratyusha321@gmail.com";
		data[0][1]      = "123456";
		data[0][2]      = "Restricted User";
		
		//2nd Row
		data[1][0]      = "batman@gotham.com";
		data[1][1]      = "123456";
		data[1][2]      = "UnRestricted User";
		
		return data;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
