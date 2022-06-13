package gozayaan.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpObj {

	WebDriver driver;
	public signUpObj(WebDriver driver) {
		this.driver = driver;
	}
	By clickSignInButton = By.xpath("//*[@class=\"auth-action\"]/button");
	public WebElement clickSignInButton() {
		return driver.findElement(clickSignInButton);
	}
	
	By clickSignUpLink = By.xpath("//*[@class=\"suggestions\"]/p/span");
	public WebElement clickSignUpLink() {
		return driver.findElement(clickSignUpLink);
	}
	By signUpUserName = By.id("email");
	public WebElement signUpUserName() {
		return driver.findElement(signUpUserName);
	}
	By signUpPhone = By.className("vti__input");
	public WebElement signUpPhone() {
		return driver.findElement(signUpPhone);
	}
	By signUpPassword = By.id("password");
	public WebElement signUpPassword() {
		return driver.findElement(signUpPassword);
	}
	By signUpCheck = By.xpath("//input[@type=\"checkbox\"]");
	public WebElement signUpCheck() {
		return driver.findElement(signUpCheck);
	}
	By signUpSubmit = By.xpath("//*[@id=\"submitBtn\"]/span");
	public WebElement signUpSubmit() {
		return driver.findElement(signUpSubmit);
	}
}

