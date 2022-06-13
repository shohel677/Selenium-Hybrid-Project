package gozayaan.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import org.testng.annotations.Test;
import DataProvider.GoDataProvider;
import gozayaan.base.base;
import gozayaan.object.profilePictureObj;

public class profilePicture extends base {
	@Test
	public void goProfilePicture() throws InterruptedException, IOException {
		log.info("Test Case for profile picture");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		profilePictureObj pp = new profilePictureObj(driver);
		pp.loginPageLink().click();
		log.info("Navigate to Login page");
		GoDataProvider loginData = new GoDataProvider();
		ArrayList<String> userLogin = loginData.getData("Login");
		pp.userName().sendKeys(userLogin.get(1));
		log.info("Entered user name");
		pp.passWord().sendKeys(userLogin.get(3));
		log.info("Entered password");
		pp.loginSubmit().click();
		log.info("Click submit button & Login successful");
		pp.profileBadge().click();
		log.info("Click in profile Badge in home page");
		pp.goToProfileLink().click();
		log.info("Click on profile link and Navigate to Profile page");
		pp.profilePictureUpButton().click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("resources/picupload.exe");
		Thread.sleep(3000);

	}
}
