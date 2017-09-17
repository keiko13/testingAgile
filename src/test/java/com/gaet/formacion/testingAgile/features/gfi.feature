Feature: Search for Videos on YouTube
Scenario: Search for Videos of Gfi
    Given I visit YouTube home page
    When I search for "gfi informatica"
    Then I click on element Sobre Gfi
	And I wait 10 seconds