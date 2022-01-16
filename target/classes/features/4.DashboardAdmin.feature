Feature: Dashboard Admin

  Scenario: Testing Dashboard Admin
  
  	When User succes go to dashboard page
		And User click periode and filter
		And User types the city in the search field and click search
		And User clicks all details on city status data
    Then User success testing dashboard