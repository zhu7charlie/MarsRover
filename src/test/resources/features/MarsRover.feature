#Author: zhu7charlie@gmail.com
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
Feature: Component Tests for MarsRover
@testCase1   
Scenario: (1, 2, 'N') --> "LMLMLMLMM" ==> (1, 3, 'N') 
    Given xMax 5 yMax 5 
    And start with position 1 2 "N"
    When moves string is "LMLMLMLMM"
    Then final position is 1 3 "N"
@testCase2  
Scenario: (3, 3, 'E') --> "MMRMMRMRRM" ==> (5, 1, 'E') 
    Given xMax 5 yMax 5 
    And start with position 3 3 "E"
    When moves string is "MMRMMRMRRM"
    Then final position is 5 1 "E"    
