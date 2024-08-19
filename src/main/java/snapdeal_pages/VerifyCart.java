package snapdeal_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import snapdeal_utils.uioperation;

public class VerifyCart {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;
	
   public VerifyCart(WebDriver driver) {
    	this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));		
      
   }
		public void verifyCartOption() {
        SoftAssert softAssert = new SoftAssert();  
        
        //clicking on cart option for added cart item view
        ui.click(By.className("cartInner"));
    
        // Verify the filtering options are applied
        boolean CartHasSomeThing = driver.findElements(By.id("cart-quantity")).size() > 0;
        softAssert.assertTrue(CartHasSomeThing, "cart has something to shop");
        
        softAssert.assertAll();
        
        ui.click(By.linkText("START SHOPPING NOW"));
        System.out.println("Verify Cart Test passed sucessfully");
        
    }
}



