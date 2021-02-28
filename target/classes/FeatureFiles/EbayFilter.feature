@regression
Feature: Ebay Search Filter Functionality

	Scenario: search for shirts with Long Sleeves

		Given Open Ebay website
		When Search for shirts
		And Select Long Sleeve filter
		Then The item list should only have Long Sleeve shirts
	
	