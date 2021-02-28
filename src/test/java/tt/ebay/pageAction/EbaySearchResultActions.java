package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultActions {
	
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
		
		}
	
	public void verifyShirtRelatedProducts(){
		EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed();
		System.out.println(EbaySearchResultLocatorsObj.txtSleeveLength.getText());
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtSleeveLength.getText(), "Sleeve Length");
		Assert.assertEquals(true, EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed());

	}

	
	public void filterBrand(String Brand) throws Exception{
		Thread.sleep(5000);
		if (Brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.cbxBrandAdidas.click();
	} else if (Brand.equals("Nike")){
			EbaySearchResultLocatorsObj.cbxBrandNike.click();
	} else if (Brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.cbxBrand.click();
	}
	}
	public void validateBrand(String Brand) throws Exception {
		Thread.sleep(5000);
		
		if (Brand.equals("Adidas")){
				EbaySearchResultLocatorsObj.txtAdidas.isDisplayed();
		} else if (Brand.equals("Nike")){
				EbaySearchResultLocatorsObj.txtNike.isDisplayed();
		} else if (Brand.equals("Unbranded")){
				EbaySearchResultLocatorsObj.txtUnbranded.isDisplayed();
	}
		
	}
}
