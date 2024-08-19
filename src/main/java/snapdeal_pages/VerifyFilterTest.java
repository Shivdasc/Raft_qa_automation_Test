package snapdeal_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import snapdeal_utils.uioperation;

public class VerifyFilterTest {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;
	
   public VerifyFilterTest(WebDriver driver) {
    	this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));		
      
   }
		public void verifyFilter() {
        SoftAssert softAssert = new SoftAssert();
        
        // Verify filtering options are displayed
        boolean filteringOptionsDisplayed = driver.findElements(By.xpath("//div[@class=\"sub-cat-name \"]")).size() > 0;
        softAssert.assertTrue(filteringOptionsDisplayed, "Filtering options are not displayed");
        
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,500)", "");
       
        // Verify filtering options can be selected and applied
        ui.click(By.xpath("//label[@for=\"Color_s-Beige\"]"));
       
        // Verify the filtering options are applied
        boolean filteringOptionsApplied = driver.findElements(By.xpath("//img[contains(@title, \"Beige\")]")).size() > 0;
        softAssert.assertTrue(filteringOptionsApplied, "Filtering options are not applied");
        
        softAssert.assertAll();
    	System.out.println("Verify Filters Test passed sucessfully");
        
    }
}



