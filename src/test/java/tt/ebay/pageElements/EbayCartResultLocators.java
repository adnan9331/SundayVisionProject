package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartResultLocators {
	
	//Checkout button
	@FindBy (xpath="//h3[contains(text(),'Men Solid V-Neck Short Sleeve T-Shirts Heavy Comfo')]")
	public WebElement txtSelectProduct;
	
	@FindBy (xpath="//select[@name='Color']")
	public WebElement txtColor;
	
	@FindBy (xpath="//select[@id='msku-sel-2']")
	public WebElement txtSize;
	
	@FindBy (xpath="//a[contains(text(),'Add to cart')]")
	public WebElement txtAddToCart;
	
	@FindBy (xpath="//span[contains(text(), 'Go to cart')]")
	public WebElement txtGoToCart;
	
	@FindBy (xpath="//span[contains(text(), 'Subtotal')]")
	public WebElement txtCheckout;
	
	//Adidas Tee
	@FindBy (xpath="//body/div[4]/div[5]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")
	public WebElement adidasTee;
	
	//Nike Pant
	@FindBy (xpath="//body/div[4]/div[5]/div[2]/div[1]/div[2]/ul[1]/li[8]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")
	public WebElement nikePant;
	
	//Unbranded Shoe
	@FindBy (xpath="//body/div[4]/div[5]/div[2]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")
	public WebElement unbrandedShoe;
}