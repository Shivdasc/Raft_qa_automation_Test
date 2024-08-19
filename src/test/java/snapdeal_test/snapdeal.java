package snapdeal_test;

import org.testng.annotations.Test;

import snapdeal_pages.VerifyBrokenLink;
import snapdeal_pages.VerifyCart;
import snapdeal_pages.VerifyClearFilter;
import snapdeal_pages.VerifyFilterTest;
import snapdeal_pages.VerifyPincodeSearch;

import snapdeal_utils.Helper;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;

public class snapdeal extends Helper {
	@Test(priority = 1)
	public void TitleTest() {         // will check and verify title of page
		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle().contains(
				"Snapdeal.com - Online shopping India- Discounts - shop Online Perfumes, Watches, sunglasses etc"),
				true);
		System.out.println("Verify Title Test passed sucessfully");
	}

	@Test(priority = 2)
	public void VerifyFilteringOptionsTest() {                  //will check filter should be display
		VerifyFilterTest vf = new VerifyFilterTest(driver);
		vf.verifyFilter();

	}

	@Test(priority = 3)
	public void VerifyClearFilterTest() {                     // will check clear filter button functioning
		VerifyClearFilter vf = new VerifyClearFilter(driver);
		vf.VerifyFilter();
	}

	@Test(priority = 4)
	public void CartTest() {                                //will check options in cart
		VerifyCart vc = new VerifyCart(driver);
		vc.verifyCartOption();
	}

	@Test(priority = 5)
	public void VerifyBrokenLinkTest() {                   //will check broken links on screen
		VerifyBrokenLink vb = new VerifyBrokenLink(driver);
		vb.verifylinks();
		System.out.println("Verify Broken Link test passed sucessfully");

	}

	@Test(priority = 6)                                      //will check pincode input field
	public void VerifyPincode() throws FileNotFoundException, IOException {
		VerifyPincodeSearch vp = new VerifyPincodeSearch(driver);
		vp.verifyPincodeField();
	}

}
