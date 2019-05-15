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

The lines in Gherkin language begin with `speacial keyword: GIVEN - WHEN - THEN - AND `
```
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
  ```
  
# 3. Cucumber Options

Let's look at some things you can do with cucumber.options. Try this:

`-Dcucumber.options="--help"`

That should list all the available options.

IMPORTANT

When you override options with -Dcucumber.options, you will completely override whatever options are hard-coded in your @CucumberOptions or in the script calling cucumber.api.cli.Main. There is one exception to this rule, and that is the --plugin option. This will not override, but add a plugin. The reason for this is to make it easier for 3rd party tools (such as Cucumber Pro) to automatically configure additional plugins by appending arguments to a cucumber.properties file.

Run a subset of Features or Scenarios
Specify a particular scenario by line (and use the pretty plugin, which prints the scenario back)

-Dcucumber.options="classpath:skeleton/belly.feature:4 --plugin pretty"
This works because Maven puts ./src/test/resources on your classpath. You can also specify files to run by filesystem path:

-Dcucumber.options="src/test/resources/skeleton/belly.feature:4 --plugin pretty"
You can also specify what to run by tag:

-Dcucumber.options="--tags @bar --plugin pretty"
Running only the scenarios that failed in the previous run
-Dcucumber.options="@target/rerun.txt"
This works as long as you have the rerun formatter enabled.

Specify a different formatter:
For example a JUnit formatter:

-Dcucumber.options="--plugin junit:target/cucumber-junit-report.xml"
