package gozayaan.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DataProvider.GoDataProvider;
import gozayaan.base.loginBase;
import gozayaan.object.profileObj;

public class profile extends loginBase {
	@Test
	public void goPofile() throws IOException, InterruptedException {
		profileObj po = new profileObj(driver);
		po.profileBadge().click();
		log.info("Click in profile Badge in home page");
		po.goToProfileLink().click();
		log.info("Click on profile link and Navigate to Profile page");
		po.editProfileButton().click();
		log.info("Click edit button");
		GoDataProvider profileData = new GoDataProvider();
		ArrayList<String> userCredentials = profileData.getData("Profile details");
		String firstName = po.inputFirstName().getAttribute("value");
		if (firstName == "") {
			po.inputFirstName().sendKeys(userCredentials.get(1));
		}
		log.info("Input first name");
		String lastName = po.inputLastName().getAttribute("value");
		if (lastName == "") {
			po.inputLastName().sendKeys(userCredentials.get(2));
		}
		log.info("Input last Name");
		po.calenderClick().click();
		String birthYear = po.birthYearGetText().getText();
		if ((birthYear != userCredentials.get(7))) {
			po.birthYearPrevButtonOne().click();
			po.birthYearPrevButtonTwo().click();
		}
		while (!po.birthYearTextwhile().getText().contains(userCredentials.get(3))) {
			po.birthYearWhileLoopAction().click();
		}
		List<WebElement> birthYearSelect = po.birthYearSelectForLoop();
		// Grab common attribute//Put into list and iterate
		int yearCount = birthYearSelect.size();
		for (int i = 0; i < yearCount; i++) {
			String yearText = birthYearSelect.get(i).getText();
			if (yearText.equalsIgnoreCase(userCredentials.get(4))) {
				birthYearSelect.get(i).click();
				break;
			}
		}
		List<WebElement> birthMonthSelect = po.birthMonthSelectForLoop();
		// Grab common attribute//Put into list and iterate
		int monthCount = birthMonthSelect.size();
		for (int i = 0; i < monthCount; i++) {
			String monthText = birthMonthSelect.get(i).getText();
			if (monthText.equalsIgnoreCase(userCredentials.get(5))) {
				birthMonthSelect.get(i).click();
				break;
			}
		}
		List<WebElement> birthDaySelect = po.birthDaySelectForLoop();
		int dayCount = birthDaySelect.size();
		for (int i = 0; i < dayCount; i++) {
			String dayText = birthDaySelect.get(i).getText();
			if (dayText.equalsIgnoreCase(userCredentials.get(6))) {
				birthDaySelect.get(i).click();
				break;
			}
		}
		log.info("Input date of birt");
		po.nationalID().sendKeys(userCredentials.get(8));
		log.info("Input NID number");
		po.genderClick().click();
		log.info("click gender");
		List<WebElement> genderSelect = po.genderSelectClick();
		int genderCount = genderSelect.size();
		for (int i = 0; i < genderCount; i++) {
			String genderText = genderSelect.get(i).getText();
			if (genderText.equalsIgnoreCase(userCredentials.get(9))) {
				genderSelect.get(i).click();
				break;
			}
		}
		log.info("Select gender");
		po.maritalClick().click();
		log.info("Click marital status");
		List<WebElement> maritalSelect = po.maritalSelectClick();
		int maritalCount = maritalSelect.size();
		for (int i = 0; i < maritalCount; i++) {
			String maritalText = maritalSelect.get(i).getText();
			if (maritalText.equalsIgnoreCase(userCredentials.get(10))) {
				maritalSelect.get(i).click();
				break;
			}
		}
		log.info("Select maital status");
		po.houseNo().sendKeys("House # 26");
		log.info("Input house number");
		po.streetName().sendKeys("Lane # 3, Block # A, Section # 6");
		log.info("Input street address");
		po.postCode().sendKeys("1216");
		log.info("Input post code");
		po.cityName().sendKeys("Dhaka");
		log.info("Input city");
		po.phoneNumber().sendKeys("01624109802");
		log.info("Input phone number");
		po.religionField().click();
		log.info("Click religion");
		List<WebElement> relegionSelect = po.religionFieldList();
		int relegionCount = relegionSelect.size();
		for (int i = 0; i < relegionCount; i++) {
			String relegionText = relegionSelect.get(i).getText();
			if (relegionText.equalsIgnoreCase("Islam")) {
				relegionSelect.get(i).click();
				break;
			}
		}
		log.info("Select religion");
		po.languageField().click();
		log.info("Click Language");
		List<WebElement> languageSelect = po.languageFieldList();
		int languageCount = relegionSelect.size();
		for (int i = 0; i < languageCount; i++) {
			String languageText = languageSelect.get(i).getText();
			if (languageText.equalsIgnoreCase("En")) {
				languageSelect.get(i).click();
				break;
			}
		}
		log.info("Select language");
		po.cancelButton().click();
		log.info("click cancel button and test case pass");
	}
	
}
