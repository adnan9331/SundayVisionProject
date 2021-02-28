@regression
Feature: Ebay Multi Cart Functionality

	Scenario Outline: Add different product to cart
	
	Given Open Ebay Website
	When Search for "<Items>"
	And Filter by "<Brand>"
	And Select "<Product>" on item list
	And Select color on "<Product>"
	And Select size on "<Product>"
	And Add to cart
	And Go to cart
	Then Validate item in cart
	
	Examples: 
		|Items |Brand    |Product       |
		|Shirts|Adidas   |Adidas shirt  |
		|Pants |Nike     |Nike pant     |
		|Shoes |Unbranded|Unbranded shoe|