package gozayaan.testcases;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import gozayaan.base.base;
import gozayaan.object.oneWayFlightObj;

public class oneWayFlight extends base {
	@Test
	public void goOneWayFlightlight() throws IOException, InterruptedException {
		log.info("Test Case for One Way Flight");
		oneWayFlightObj owf =new oneWayFlightObj(driver);
		new WebDriverWait(driver, Duration.ofSeconds(3)).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[1]")));
		owf.clickSearchBar().click();
		log.info("Click Search Bar");
				owf.departPortKeyInput().sendKeys("chit");
				log.info("Send chit key for chittagong");
		new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.elementToBeClickable(By.className("airport-name")));
		 List<WebElement> departureSelect = owf.departAirport();
		// Grab common attribute//Put into list and iterate
		int departureCount = departureSelect.size();
		for (int i = 0; i < departureCount; i++) {
			String airportText = departureSelect.get(i).getText();
			if (airportText.equalsIgnoreCase("Shah Amanat International Airport")) {
				departureSelect.get(i).click();
				break;
			}
		}
		log.info("Select chittagong airport");
		new WebDriverWait(driver, Duration.ofSeconds(3)).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchbar\"]/div[3]/div[2]/div[2]")));
		owf.arrivePortSearcClick().click();
		log.info("click depart searchbar");
		owf.arrivePortKeyInput().sendKeys("jess");
		log.info("Send keys for arrive port ");
		new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.elementToBeClickable(By.className("airport-name")));
		List<WebElement> arrivalSelect = owf.arrivePortSelectList();
		// Grab common attribute//Put into list and iterate
		int arrivalCount = arrivalSelect.size();
		for (int i = 0; i < arrivalCount; i++) {
			String arivalAirportText = arrivalSelect.get(i).getText();
			if (arivalAirportText.equalsIgnoreCase("Jessore Airport")) {
				arrivalSelect.get(i).click();
				break;
			}
		}
		log.info("Select arrive airport");
		while (!owf.departMonthListSelect().getText().contains("July, 2022")) {
			owf.departMonthzClick().click();
		}
		Thread.sleep(3000);
		List<WebElement> departDateElement = owf.departDateClick();

		int departDateCount = departDateElement.size();
		for (int i = 0; i < departDateCount; i++) {
			String departDate = departDateElement.get(i).getText();
			if (departDate.equalsIgnoreCase("25")) {
				departDateElement.get(i).click();
				break;
			}
		}
		log.info("Select date of journey");
		owf.travellerClick().click();

		for (int i = 1; i < 5; i++) {
			owf.adultSelect().click();

		}
		log.info("Select number of adult");
		for (int i = 0; i < 1; i++) {
			owf.childSelect().click();

		}
		log.info("Select number of child");

		Select s = new Select(owf.childernAgeSelect());
		s.selectByVisibleText("7");
		log.info("Select age of child");
		owf.flightClass().click();
		log.info("Select flight class");
		owf.guestPickerDone().click();
		log.info("click done");
		owf.flightButtonClick().click();
		log.info("Click flight search and test case pass");
	}
}
