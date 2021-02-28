package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartResultActions;
import tt.ebay.pageAction.EbayHomepageActions;

public class EbayCartStep {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	EbayCartResultActions EbayCartResultActionsObj = new EbayCartResultActions();
	
	
	@When("^Select first shirt product on item list$")
	public void select_first_shirt_product_on_item_list() throws Throwable {
	   System.out.println("Select first shirt product on item list");
	   EbayCartResultActionsObj.selectFirstShirtProduct();
	}

	@When("^Select color on shirt$")
	public void select_color_on_shirt() throws Throwable {
		System.out.println("Select color on shirt");
		EbayCartResultActionsObj.selectColor();
	}
	
	@When("^Select size on shirt$")
	public void select_size_on_shirt() throws Throwable {
		System.out.println("Select size on shirt");
		EbayCartResultActionsObj.selectSize();
	}

	@When("^Add to cart$")
	public void add_to_cart() throws Throwable {
		System.out.println("Add to cart");
		EbayCartResultActionsObj.clickAddToCart();
	}

	@When("^Go to cart$")
	public void go_to_cart() throws Throwable {
		System.out.println("Go to cart");
		EbayCartResultActionsObj.clickGoToCart();
	}

	@Then("^Validate item in cart$")
	public void validate_item_in_cart() throws Throwable {
		System.out.println("Validate item in cart");
		EbayCartResultActionsObj.verifyItemInCart();
	}

}