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
import gozayaan.object.roundWayFlightObj;

public class roundWayFlight extends base {
	@Test
	public void goRoundWayFlight() throws IOException, InterruptedException {
		log.info("Test Case for Round way flight");
		roundWayFlightObj rwf = new roundWayFlightObj(driver);
		rwf.roundWaySelect().click();
		rwf.clickDepartField().click();
		rwf.inputDepartKey().sendKeys("dha");
		new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.elementToBeClickable(By.className("airport-name")));
		List<WebElement> roundFlightPort = rwf.selectDepartPortNamee();
		int roundFlightCount = roundFlightPort.size();
		for (int i = 0; i < roundFlightCount; i++) {
			String roundFlightPortName = roundFlightPort.get(i).getText();
			if (roundFlightPortName.equalsIgnoreCase("Hazrat Shahjalal International Airport")) {
				roundFlightPort.get(i).click();
				break;
			}
		}
		rwf.arrivalPortNameeClick().click();
		rwf.arrivalPortSendKey().sendKeys("sai");
		new WebDriverWait(driver, Duration.ofSeconds(3))
				.until(ExpectedConditions.elementToBeClickable(By.className("airport-name")));
		List<WebElement> arrivedRoundFlightPort = rwf.arrivalPortListSelect();
		int arrivedRoundFlightPortCount = arrivedRoundFlightPort.size();
		for (int i = 0; i < arrivedRoundFlightPortCount; i++) {
			String arrivedRoundFlightPortName = arrivedRoundFlightPort.get(i).getText();
			if (arrivedRoundFlightPortName.equalsIgnoreCase("Saidpur Airport")) {
				arrivedRoundFlightPort.get(i).click();
				break;
			}
		}
		while (!rwf.departMonthSelectt().getText().contains("August, 2022")) {
			rwf.departMonthClickk().click();
		}
		Thread.sleep(3000);
		List<WebElement> departDateElement = rwf.departDayListCol();
		int departDateCount = departDateElement.size();
		for (int i = 0; i < departDateCount; i++) {
			String departDate = departDateElement.get(i).getText();
			if (departDate.equalsIgnoreCase("25")) {
				departDateElement.get(i).click();
				break;
			}
		}
		while (!rwf.arriveMonthSelectt().getText().contains("September, 2022")) {
			rwf.arriveMonthClickk().click();
		}
		Thread.sleep(3000);
		List<WebElement> arriveDateElement = rwf.arriveDayListSelect();

		int arriveDateCount = arriveDateElement.size();
		for (int i = 0; i < arriveDateCount; i++) {
			String arriveDate = arriveDateElement.get(i).getText();
			if (arriveDate.equalsIgnoreCase("25")) {
				arriveDateElement.get(i).click();

				break;
			}

		}
		log.info("Select date of journey");
		rwf.travellerClick().click();

		for (int i = 1; i < 5; i++) {
			rwf.adultSelect().click();

		}
		log.info("Select number of adult");
		for (int i = 0; i < 1; i++) {
			rwf.childSelect().click();

		}
		log.info("Select number of child");

		Select s = new Select(rwf.childernAgeSelect());
		s.selectByVisibleText("7");
		log.info("Select age of child");
		rwf.flightClass().click();
		log.info("Select flight class");
		rwf.guestPickerDone().click();
		log.info("click done");
		rwf.flightButtonClick().click();
		log.info("Click flight search and test case pass");
	}
}
