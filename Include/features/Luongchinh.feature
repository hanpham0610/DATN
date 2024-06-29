#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enume  rate more Given,When,Then steps
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
  Scenario Outline: Title of your scenario outline
    Given User navigates to HomePage
    When User click on ItemAccount
    And User navigates to the loginpage
    When Input <username> and <password> to Logiform
    When Click on Login btn
    Then User navigates to the account page
    When User click on button home
    When User Click on product
    And User click chose size of product
    When User click on button add to cart
    And User click on see cart
    Then User navigates to the cart page
    When User click on Paybtn
    Then User navigates to OrderForm
    When User Input <hoten>, <sdt> and <diachi> to OrderForm
    And User click on CompleteForm 
    Then Verify Notification

    Examples: 
      | username                | password                 | hoten        | sdt        | diachi            |
      | sakurakiss102@gmail.com | 4ybX0yEUURQGlglqMZvhTw== | Pham Thi Han | 0848799443 | My Hao - Hung Yen |
