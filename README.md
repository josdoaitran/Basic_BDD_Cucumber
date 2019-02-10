# 1.Basic BDD Cucumber
Basic BDD and Cucumber for beginners can get acquainted 

## Why we should use BDD, instead of TDD ?

BDD

TDD

## Behaviour Driven Development tools

**Cucumber**

**jbhave**

**Serenity**

Example: https://github.com/josdoaitran/SerenityBDDFW

# 2. Gherkin language

Syntax: GIVEN - WHEN - THEN

The lines in Gherkin language begin with `speacial keyword: GIVEN WHEN THEN AND `

Feature: Some terse yet descriptive text of what is desired
  In order to realize a named business value
  As an explicit system actor
  I want to gain some beneficial outcome which furthers the goal

  Scenario: Some determinable business situation
    Given some precondition
      And some other precondition
     When some action by the actor
      And some other action
      And yet another action
     Then some testable outcome is achieved
      And something else we can check happens too

  Scenario: A different situation
  ...
  
  
