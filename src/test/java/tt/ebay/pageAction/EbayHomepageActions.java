package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayHomepageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomepageActions {

	EbayHomepageLocators EbayHomepageLocatorsObj;
	
	public EbayHomepageActions(){	
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
		
	}
	
	public void loadEbayHomepage(){
		SetupDrivers.driver.get("https://www.ebay.com/");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		SetupDrivers.driver.manage().window().maximize();
	}
	
	public void searchShirts(){
		EbayHomepageLocatorsObj.txtSearchForAnything.clear();
		EbayHomepageLocatorsObj.txtSearchForAnything.sendKeys("Shirts");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchItem(String item){
		EbayHomepageLocatorsObj.txtSearchForAnything.clear();
		EbayHomepageLocatorsObj.txtSearchForAnything.sendKeys(item);
		EbayHomepageLocatorsObj.btnSearch.click();
	}
}
