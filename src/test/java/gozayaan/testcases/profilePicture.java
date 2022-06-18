package gozayaan.testcases;

import java.io.IOException;
import java.time.Duration;
import org.testng.annotations.Test;
import gozayaan.base.loginBase;
import gozayaan.object.profilePictureObj;

public class profilePicture extends loginBase {
	@Test
	public void goProfilePicture() throws InterruptedException, IOException {
		log.info("Test Case for profile picture");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		profilePictureObj pp = new profilePictureObj(driver);
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
