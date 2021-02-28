package tt.ebay.stepDef;

import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartResultActions;
import tt.ebay.pageAction.EbayHomepageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayMultiCartOutlineSteps {
	
	 EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	 EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	 EbayCartResultActions EbayCartResultActionsObj = new EbayCartResultActions();
	
	@When("^Select \"([^\"]*)\" on item list$")
	public void select_on_item_list(String product) throws Throwable {
		EbayCartResultActionsObj.selectProduct(product);
	}

	@When("^Select color on \"([^\"]*)\"$")
	public void select_color_on(String product) throws Throwable {
		EbayCartResultActionsObj.selectProduct(product);
	}

	@When("^Select size on \"([^\"]*)\"$")
	public void select_size_on(String product) throws Throwable {
		EbayCartResultActionsObj.selectProduct(product);
	}

}