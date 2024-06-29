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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1

   Scenario: Signin False
    Given User navigates to the homepage
    And User click on the item account
    When User navigates to  login page
    And Click on SigninText
    When User inputs the following credentials: ho Pham, ten Han, email sakurakiss102@gmail.com, and password 4ybX0yEUURQGlglqMZvhTw==
    And Click on signin btn
    Then Verify text

    #Examples: 
      #| ho 		| ten 	| email  										|password								 |
      #| Pham	|   Han | sakurakiss1022gmail.com 	|4ybX0yEUURQGlglqMZvhTw==|

     	
     	
