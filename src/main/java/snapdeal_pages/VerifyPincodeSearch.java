package snapdeal_pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import snapdeal_utils.Helper;
import snapdeal_utils.uioperation;

public class VerifyPincodeSearch extends Helper {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public VerifyPincodeSearch(WebDriver driver) throws FileNotFoundException, IOException {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));
		prop = new Properties();
		prop.load(new FileInputStream("src/test/resources/config.properties"));

	}

	public void verifyPincodeField() {

		// fetch pincode from config file
		String pinocde = prop.getProperty("pinocde");
		ui.type(By.xpath("//input[@placeholder=\"Enter your pincode\"]"), pinocde);
		ui.click(By.xpath("//button[@class=\"pincode-check\"]"));                           //click on apply button

		SoftAssert softAssert = new SoftAssert();
		boolean filteringOptionsDisplayed = driver.findElements(By.xpath("//img[@class=\"product-image wooble\"]"))
				.size() > 0;
		softAssert.assertTrue(filteringOptionsDisplayed, "Filtering options are not displayed");

		System.out.println("Verify pincode filed test passed successfully");

	}
}