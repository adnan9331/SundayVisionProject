package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	//Sleeve Length
	@FindBy (xpath="//h3[text()='Sleeve Length']")
	public WebElement txtSleeveLength;

	//Brand Nike
	@FindBy (xpath="//*[@aria-label='Nike']")
	public WebElement cbxBrandNike;
	
	//Brand Adidas
	@FindBy (xpath="//*[@aria-label='adidas']")
	public WebElement cbxBrandAdidas;
		
	//Brand Unbranded
	@FindBy (xpath="//*[@aria-label='Unbranded']")
	public WebElement cbxBrand;
	
	@FindBy (xpath="//*[contains(text(),'Nike')]")
	public WebElement txtNike;
		
	
	@FindBy (xpath="//*[contains(text(),'adidas')]")
	public WebElement txtAdidas;
		

	@FindBy (xpath="//*[contains(text(),'Unbranded')]")
	public WebElement txtUnbranded;
}
	

