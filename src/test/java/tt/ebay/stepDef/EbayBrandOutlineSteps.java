package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayBrandOutlineSteps{
	
	 EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	 EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String item) throws Throwable {
	    EbayHomepageActionsObj.searchItem(item);
	}

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
	    EbaySearchResultActionsObj.filterBrand(brand);
	}

	@Then("^Item list have should prodcut of \"([^\"]*)\"$")
	public void item_list_have_should_prodcut_of(String brand) throws Throwable {
		 EbaySearchResultActionsObj.validateBrand(brand);
	}

}