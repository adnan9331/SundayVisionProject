@regression
Feature: Ebay Brand Outline

Scenario Outline: Search for items with brand
	Given Open Ebay Website
	When Search for "<Items>"
	And Filter by "<Brand>"
	Then Item list have should prodcut of "<Brand>" 
	
	Examples: 
		|Items |Brand    |
		|Shirts|Adidas   |
		|Pants |Nike     |
		|Shoes |Unbranded|