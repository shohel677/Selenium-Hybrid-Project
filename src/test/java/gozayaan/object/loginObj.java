package gozayaan.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginObj {
	WebDriver driver;
	public loginObj(WebDriver driver) {
		this.driver = driver;
		
	}
	By loginPageLink = By.xpath("//*[@class=\"auth-action\"]//*[@type=\"button\"]");
	
	public WebElement loginPageLink() {
		return driver.findElement(loginPageLink);
	}
	
	By userName =By.id("email");
	public WebElement userName () {
		return  driver.findElement(userName);
	}
	By passWord = By.id("password");
	public WebElement passWord() {
	return driver.findElement(passWord);	
	}
	By loginSubmit= By.xpath("//*[@id=\"submitBtn\"]/span");
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
}
