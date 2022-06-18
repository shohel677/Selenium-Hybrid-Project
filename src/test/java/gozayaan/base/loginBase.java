package gozayaan.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import DataProvider.GoDataProvider;
import gozayaan.object.loginObj;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginBase {
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public WebDriver driver;

	public static String browser = "chrome";

	@BeforeSuite
	public WebDriver initializeDriver() throws IOException {

		Properties config = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\resources\\config.properties");
		config.load(fis);
		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		log.info("Browser launched");
		driver.get(config.getProperty("testsiteurl"));
		log.info("Navigate to home page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class=\"dn-slide-body\"]//*[@class=\"dn-slide-deny-btn\"]")).click();
		log.info("Pop up closed");
		
		return driver;
	}

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Browser initialize");
		log.info("Test Case for login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginObj loginObject = new loginObj(driver);
		loginObject.loginPageLink().click();
		log.info("Navigate to Login page");
		GoDataProvider loginData = new GoDataProvider();
		ArrayList<String> userLogin = loginData.getData("Login");
		loginObject.userName().sendKeys(userLogin.get(1));
		log.info("Entered user name");
		loginObject.passWord().sendKeys(userLogin.get(3));
		log.info("Entered password");
		loginObject.loginSubmit().click();
		log.info("Click submit button & LOgin successful");

	}

	@AfterTest
	public void browserQuit() throws InterruptedException {
		Thread.sleep(2000);

		driver.quit();

	}

	@AfterSuite
	public void afterSuite() {

		driver.quit();
	}

}