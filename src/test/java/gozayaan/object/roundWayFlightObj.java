package gozayaan.object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class roundWayFlightObj {
	WebDriver driver;
	public roundWayFlightObj (WebDriver driver) {
		this.driver = driver;
	}
	By roundWaySelect = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[1]/label[2]/span[1]");
	public WebElement roundWaySelect() {
		return driver.findElement(roundWaySelect);
	}
	By clickDepartField = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[1]/div[1]");
	public WebElement clickDepartField() {
		return driver.findElement(clickDepartField);
	}
	By inputDepartKey = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[1]/div[2]/div[1]/input");
	public WebElement inputDepartKey() {
		return driver.findElement(inputDepartKey);
	}
	By selectDepartPortNamee = By.className("airport-name");
	public List<WebElement> selectDepartPortNamee() {
		return driver.findElements(selectDepartPortNamee);
	}
	By arrivalPortNameeClick = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[2]/div");
	public WebElement arrivalPortNameeClick() {
		return driver.findElement(arrivalPortNameeClick);
	}
	By arrivalPortSendKey = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[2]/div[2]/div[1]/input");
	public WebElement arrivalPortSendKey() {
		return driver.findElement(arrivalPortSendKey);
	}
	By arrivalPortListSelect = By.className("airport-name");
	public List<WebElement> arrivalPortListSelect() {
		return driver.findElements(arrivalPortListSelect);
	}
	By departMonthSelectt = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[3]/div[2]");
	public WebElement departMonthSelectt() {
		return driver.findElement(departMonthSelectt);
	}
	By departMonthClickk = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/span");
	public WebElement departMonthClickk() {
		return driver.findElement(departMonthClickk);
	}
	By departDayListCol = By.className("day");
	public List<WebElement> departDayListCol() {
		return driver.findElements(departDayListCol);
	}
	By arriveMonthSelectt = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[3]/div[2]");
	public WebElement arriveMonthSelectt() {
		return driver.findElement(arriveMonthSelectt);
	}
	By arriveMonthClickk = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[3]/div[2]/div[2]/div[2]/div[1]/span");
	public WebElement arriveMonthClickk() {
		return driver.findElement(arriveMonthClickk);
	}
	By arriveDayListSelect = By.className("day");
	public List<WebElement> arriveDayListSelect() {
		return  driver.findElements(arriveDayListSelect);
	}
	By travellerClick = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[5]/div[1]");
	public WebElement travellerClick() {
		return driver.findElement(travellerClick);
	}
	By adultSelect = By.xpath("//*[@id=\"guestPicker\"]/div[2]/div[1]/div[2]/button[2]/img");
	public WebElement adultSelect() {
		return driver.findElement(adultSelect);
	}
	By childSelect = By.xpath("//*[@id=\"guestPicker\"]/div[2]/div[2]/div/div[2]/button[2]/img");
	public WebElement childSelect() {
		return driver.findElement(childSelect);
	}
	By childernAgeSelect = By.xpath("//*[@class=\"children-age\"]/div/select");
	public WebElement childernAgeSelect() {
		return driver.findElement(childernAgeSelect);
	}
	By flightClass = By.xpath("//*[@id=\"guestPicker\"]/div[3]/div[2]/label[2]/span[1]");
	public WebElement flightClass() {
		return driver.findElement(flightClass);
	}
	By guestPickerDone = By.xpath("//*[@id=\"guestPicker\"]/div[3]/div[3]/button");
	public WebElement guestPickerDone() {
		return driver.findElement(guestPickerDone);
	}
	By flightButtonClick = By.xpath("//*[@id=\"searchbar\"]/div[4]/button");
	public WebElement flightButtonClick() {
		return driver.findElement(flightButtonClick);
	}

}
