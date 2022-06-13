package gozayaan.object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class profileObj {

	WebDriver driver;

	public profileObj(WebDriver driver) {
		this.driver = driver;
	}

	By loginPageLink = By.xpath("//*[@class=\"auth-action\"]//*[@type=\"button\"]");

	public WebElement loginPageLink() {
		return driver.findElement(loginPageLink);
	}

	By userName = By.id("email");

	public WebElement userName() {
		return driver.findElement(userName);
	}

	By passWord = By.id("password");

	public WebElement passWord() {
		return driver.findElement(passWord);
	}

	By loginSubmit = By.xpath("//*[@id=\"submitBtn\"]/span");

	public WebElement loginSubmit() {
		return driver.findElement(loginSubmit);
	}

	By profileBadge = By.className("badge-primary");

	public WebElement profileBadge() {
		return driver.findElement(profileBadge);
	}

	By goToProfileLink = By.linkText("Profile");

	public WebElement goToProfileLink() {
		return driver.findElement(goToProfileLink);
	}

	By editProfileButton = By.cssSelector("[class=\"edit-btn\"]");

	public WebElement editProfileButton() {
		return driver.findElement(editProfileButton);
	}

	By inputFirstName = By.id("first-name");

	public WebElement inputFirstName() {
		return driver.findElement(inputFirstName);
	}

	By inputLastName = By.id("last-name");

	public WebElement inputLastName() {
		return driver.findElement(inputLastName);
	}

	By calenderClick = By
			.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[4]/div/div/div/div[1]/input");

	public WebElement calenderClick() {
		return driver.findElement(calenderClick);
	}

	By birthYearGetText = By.xpath(
			"/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[4]/div/div/div/div[2]/header/span[2]");

	public WebElement birthYearGetText() {
		return driver.findElement(birthYearGetText);
	}

	By birthYearPrevButtonOne = By.xpath(
			"/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[4]/div/div/div/div[2]/header/span[2]");

	public WebElement birthYearPrevButtonOne() {
		return driver.findElement(birthYearPrevButtonOne);
	}

	By birthYearPrevButtonTwo = By.xpath(
			"/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[4]/div/div/div/div[3]/header/span[2]");

	public WebElement birthYearPrevButtonTwo() {
		return driver.findElement(birthYearPrevButtonTwo);
	}

	By birthYearTextwhile = By.xpath(
			"/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[4]/div/div/div/div[4]/header/span[2]");

	public WebElement birthYearTextwhile() {
		return driver.findElement(birthYearTextwhile);
	}

	By birthYearWhileLoopAction = By.xpath(
			"/html/body/div[2]/div/div[2]/div/div[2]/div[1]/div[1]/div[1]/div[4]/div/div/div/div[4]/header/span[1]");

	public WebElement birthYearWhileLoopAction() {
		return driver.findElement(birthYearWhileLoopAction);
	}

	By birthYearSelectForLoop = By.className("year");

	public List<WebElement> birthYearSelectForLoop() {
		return driver.findElements(birthYearSelectForLoop);
	}

	By birthMonthSelectForLoop = By.className("month");

	public List<WebElement> birthMonthSelectForLoop() {
		return driver.findElements(birthMonthSelectForLoop);
	}

	By birthDaySelectForLoop = By.className("day");

	public List<WebElement> birthDaySelectForLoop() {
		return driver.findElements(birthDaySelectForLoop);
	}

	By nationalID = By.id("national-id");

	public WebElement nationalID() {
		return driver.findElement(nationalID);
	}

	By genderClick = By.cssSelector("[id=\"vs1__combobox\"]");

	public WebElement genderClick() {
		return driver.findElement(genderClick);
	}

	By genderSelectClick = By.xpath("//*[@id=\"vs1__listbox\"]/li");

	public List<WebElement> genderSelectClick() {
		return driver.findElements(genderSelectClick);
	}

	By maritalClick = By.cssSelector("[id=\"vs2__combobox\"]");

	public WebElement maritalClick() {
		return driver.findElement(maritalClick);
	}

	By maritalSelectClick = By.xpath("//*[@id=\"vs2__listbox\"]/li");

	public List<WebElement> maritalSelectClick() {
		return driver.findElements(maritalSelectClick);
	}

	By houseNo = By.xpath("(//*[@id=\"house-no\"])[1]");

	public WebElement houseNo() {
		return driver.findElement(houseNo);
	}

	By streetName = By.xpath("(//*[@id=\"street-name\"])[1]");

	public WebElement streetName() {
		return driver.findElement(streetName);
	}

	By postCode = By.xpath("(//*[@id=\"postal-code\"])[1]");

	public WebElement postCode() {
		return driver.findElement(postCode);
	}

	By cityName = By.xpath("(//*[@id=\"city\"])[1]");

	public WebElement cityName() {
		return driver.findElement(cityName);
	}

	By phoneNumber = By.className("phone-input");

	public WebElement phoneNumber() {
		return driver.findElement(phoneNumber);
	}

	By religionField = By.cssSelector("[id=\"vs3__combobox\"]");

	public WebElement religionField() {
		return driver.findElement(religionField);
	}

	By religionFieldList = By.xpath("//*[@id=\"vs3__listbox\"]/li");

	public List<WebElement> religionFieldList() {
		return driver.findElements(religionFieldList);
	}

	By languageField = By.cssSelector("[id=\"vs4__combobox\"]");

	public WebElement languageField() {
		return driver.findElement(languageField);
	}

	By languageFieldList = By.xpath("//*[@id=\"vs4__listbox\"]/li");

	public List<WebElement> languageFieldList() {
		return driver.findElements(languageFieldList);
	}
	By cancelButton = By.xpath("(//*[@class=\"card-footer\"]/div/button)[1]");

	public WebElement cancelButton() {
		return driver.findElement(cancelButton);
	}
}
