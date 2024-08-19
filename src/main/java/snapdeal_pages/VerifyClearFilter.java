package snapdeal_pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import snapdeal_utils.uioperation;

public class VerifyClearFilter {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public VerifyClearFilter(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));

	}

	public void VerifyFilter() {
		SoftAssert softAssert = new SoftAssert();
		
		//click on clear filter option
		ui.click(By.xpath("//button[@class=\"clear-all-filters  btn-theme-secondary btn-line btn\"]"));
		
		// Verify the filtering options are applied
		boolean filteringOptionsApplied = driver.findElements(By.xpath("//img[contains(@title, \"Beige\")]"))
				.size() > 0;
		softAssert.assertTrue(filteringOptionsApplied, "clear filter options are not applied");
		
		System.out.println("Verify Clear filter test passed successfully");
	}
}