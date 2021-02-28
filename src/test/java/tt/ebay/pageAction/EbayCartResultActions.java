package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import tt.ebay.pageElements.EbayCartResultLocators;
import tt.utilities.SetupDrivers;

public class EbayCartResultActions {
	
	EbayCartResultLocators EbayCartResultLocatorsObj;
	
	public EbayCartResultActions(){
		EbayCartResultLocatorsObj = new EbayCartResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartResultLocatorsObj);

	}
	//Method for Select product, Method select color, select size, add to cart, go to cart, validate cart
	public void selectFirstShirtProduct(){
		EbayCartResultLocatorsObj.txtSelectProduct.click();	
	}
	public void selectColor(){
		EbayCartResultLocatorsObj.txtColor.sendKeys("Black");
	}
	public void selectSize(){
		EbayCartResultLocatorsObj.txtSize.sendKeys("M");
	}
	public void clickAddToCart(){
		EbayCartResultLocatorsObj.txtAddToCart.click();
	}
	public void clickGoToCart(){
		EbayCartResultLocatorsObj.txtGoToCart.click();
	}	
	public void verifyItemInCart(){	
		EbayCartResultLocatorsObj.txtCheckout.isDisplayed();	
	}
	
	public void selectProduct(String Product) throws Exception{
		Thread.sleep(5000);
		if (Product.equals("Adidas shirt")){
			EbayCartResultLocatorsObj.adidasTee.click();
			Thread.sleep(5000);
			Select ddColor = new Select (EbayCartResultLocatorsObj.txtColor);
			ddColor.selectByVisibleText("Black");
			Thread.sleep(10000);
//			EbayCartResultLocatorsObj.txtColor.sendKeys("Black");
			EbayCartResultLocatorsObj.txtSize.sendKeys("S");
			EbayCartResultLocatorsObj.txtAddToCart.click();
			EbayCartResultLocatorsObj.txtGoToCart.click();
			EbayCartResultLocatorsObj.txtCheckout.isDisplayed();
	} else if (Product.equals("Nike pant")){
			EbayCartResultLocatorsObj.nikePant.click();
			EbayCartResultLocatorsObj.txtAddToCart.click();
			EbayCartResultLocatorsObj.txtGoToCart.click();
			EbayCartResultLocatorsObj.txtCheckout.isDisplayed();
	} else if (Product.equals("Unbranded shoe")){
			EbayCartResultLocatorsObj.unbrandedShoe.click();
			EbayCartResultLocatorsObj.txtColor.sendKeys("Black");
			EbayCartResultLocatorsObj.txtSize.sendKeys("US6.5-EU39");
			EbayCartResultLocatorsObj.txtAddToCart.click();
			EbayCartResultLocatorsObj.txtGoToCart.click();
			EbayCartResultLocatorsObj.txtCheckout.isDisplayed();
	}
	}
	
}