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
Feature: Login Feature
  User tests login feature with valid and invalid scenarios

  @tag1
  Scenario: User should be able to login with valid cred
    Given User launch url "https://practicetestautomation.com/practice-test-login/"
    When User enter username "student"
    And User enter password "Password123"
    And User click on login button
    Then User should login successfully

  @tag2
  Scenario Outline: User should be able to login with valid cred
    Given User launch url <url>
    When User enter username <username>
    And User enter password <password>
    And User click on login button
    Then User should login successfully

    Examples: 
      | url                                                     | username    | password    |
      | "https://practicetestautomation.com/practice-test-login/" | "student"     | "Password123" |
      | "https://practicetestautomation.com/practice-test-login/" | "Password123" | "student"     |
