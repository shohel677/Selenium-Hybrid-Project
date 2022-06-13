package gozayaan.object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class oneWayFlightObj {
	WebDriver driver;
	public oneWayFlightObj(WebDriver driver) {
		this.driver = driver;
	}
	 By clickSearchBar = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[1]");
	public WebElement clickSearchBar () {
		return driver.findElement(clickSearchBar);
	}
	 By departPortKeyInput = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[1]/div[2]/div[1]/input");
	public WebElement departPortKeyInput() {
		return driver.findElement(departPortKeyInput);
	}
	By departAirport = By.className("airport-name");
	public List<WebElement> departAirport() {
		return driver.findElements(departAirport);
	}
	By arrivePortSearcClick =By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[2]");
	public WebElement arrivePortSearcClick() {
		return  driver.findElement(arrivePortSearcClick);
	}
	By arrivePortKeyInput = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[2]/div[2]/div[1]/input");
	public WebElement arrivePortKeyInput() {
		return driver.findElement(arrivePortKeyInput);
	}
	By arrivePortSelectList = By.className("airport-name");
	public List<WebElement> arrivePortSelectList() {
		return driver.findElements(arrivePortSelectList);
	}
	By departMonthListSelect = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]");
	public WebElement departMonthListSelect() {
		return driver.findElement(departMonthListSelect);
	}
	By  departMonthzClick = By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/span[2]");
	public WebElement departMonthzClick() {
		return driver.findElement(departMonthzClick);
	}
	By departDateClick = By.className("day");
	public List<WebElement> departDateClick() {
		return driver.findElements(departDateClick);
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

