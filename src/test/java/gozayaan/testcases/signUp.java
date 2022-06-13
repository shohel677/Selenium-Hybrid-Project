package gozayaan.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import org.testng.annotations.Test;
import DataProvider.GoDataProvider;
import gozayaan.base.base;
import gozayaan.object.signUpObj;

public class signUp extends base {
	@Test(priority = 1)
	public void goSignUp() throws IOException {
		log.info("Test Case for sign up");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		signUpObj su = new signUpObj(driver);
		su.clickSignInButton().click();
		su.clickSignUpLink().click();
		GoDataProvider d = new GoDataProvider();
		ArrayList<String> SiginUpDetails = d.getData("Sign Up");
		su.signUpUserName().sendKeys(SiginUpDetails.get(1));
		su.signUpPhone().sendKeys(SiginUpDetails.get(2));
		su.signUpPassword().sendKeys(SiginUpDetails.get(3));
		if (su.signUpCheck().getAttribute("checked") != null) {

		} else {
			su.signUpCheck().click();
		}
		su.signUpSubmit().click();

	}
}
