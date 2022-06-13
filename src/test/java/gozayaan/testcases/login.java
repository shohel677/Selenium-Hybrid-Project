package gozayaan.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;



import org.testng.annotations.Test;

import DataProvider.GoDataProvider;
import gozayaan.base.base;
import gozayaan.object.loginObj;

public class login extends base {
	

	@Test
	public void goLogin() throws IOException {
		log.info("Test Case for login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginObj loginObject = new loginObj(driver);
		loginObject.loginPageLink().click();
		log.info("Navigate to Login page");
		GoDataProvider loginData = new GoDataProvider();
		ArrayList<String> userLogin = loginData.getData("Login");
		loginObject.userName().sendKeys(userLogin.get(1));
		log.info("Entered user name");
		loginObject.passWord().sendKeys(userLogin.get(3));
		log.info("Entered password");
		loginObject.loginSubmit().click();
		log.info("Click submit button & LOgin successful");


	}
}
