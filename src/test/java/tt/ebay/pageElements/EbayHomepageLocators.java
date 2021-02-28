package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {

		//Search for anything
		@FindBy (xpath="//input[@id='gh-ac']")
		public WebElement txtSearchForAnything;

		//Search
		@FindBy (xpath="//input[@id='gh-btn']")
		public WebElement btnSearch;
}
