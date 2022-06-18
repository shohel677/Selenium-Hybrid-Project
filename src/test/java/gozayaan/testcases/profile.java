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
		GoDataProvider profileData = new GoDataProvider();
		ArrayList<String> userCredentials = profileData.getData("Profile details");
		String firstName = po.inputFirstName().getAttribute("value");
		if (firstName == "") {
			po.inputFirstName().sendKeys(userCredentials.get(1));
		}
		String lastName = po.inputLastName().getAttribute("value");
		if (lastName == "") {
			po.inputLastName().sendKeys(userCredentials.get(2));
		}
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
		po.nationalID().sendKeys(userCredentials.get(8));
		po.genderClick().click();

		List<WebElement> genderSelect = po.genderSelectClick();
		int genderCount = genderSelect.size();
		for (int i = 0; i < genderCount; i++) {
			String genderText = genderSelect.get(i).getText();
			if (genderText.equalsIgnoreCase(userCredentials.get(9))) {
				genderSelect.get(i).click();
				break;
			}
		}
		po.maritalClick().click();
		List<WebElement> maritalSelect = po.maritalSelectClick();
		int maritalCount = maritalSelect.size();
		for (int i = 0; i < maritalCount; i++) {
			String maritalText = maritalSelect.get(i).getText();
			if (maritalText.equalsIgnoreCase(userCredentials.get(10))) {
				maritalSelect.get(i).click();
				break;
			}
		}
		po.houseNo().sendKeys("House # 26");
		po.streetName().sendKeys("Lane # 3, Block # A, Section # 6");
		po.postCode().sendKeys("1216");
		po.cityName().sendKeys("Dhaka");
		po.phoneNumber().sendKeys("01624109802");
		po.religionField().click();
		List<WebElement> relegionSelect = po.religionFieldList();
		int relegionCount = relegionSelect.size();
		for (int i = 0; i < relegionCount; i++) {
			String relegionText = relegionSelect.get(i).getText();
			if (relegionText.equalsIgnoreCase("Islam")) {
				relegionSelect.get(i).click();
				break;
			}
		}
		po.languageField().click();
		List<WebElement> languageSelect = po.languageFieldList();
		int languageCount = relegionSelect.size();
		for (int i = 0; i < languageCount; i++) {
			String languageText = languageSelect.get(i).getText();
			if (languageText.equalsIgnoreCase("En")) {
				languageSelect.get(i).click();
				break;
			}
		}
		po.cancelButton().click();
	}
}
