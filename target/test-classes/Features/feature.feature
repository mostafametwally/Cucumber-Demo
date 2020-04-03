#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Title of your feature

 Scenario: Title of your scenario
    Given I want to write a step with precondition
    #And navigate to "https://www.google.com
    And navigate to url
    |https://www.crm.com|
    When I complete action
    Then I validate the outcome
    And Close the browser
#Examples:
#	|url											|
#	|https://www.google.com		|
#	|https://www.crm.com			|
#	|https://www.youtube.com/	|
	
	
	