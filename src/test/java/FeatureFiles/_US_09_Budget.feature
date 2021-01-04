Feature: Budget Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login Button
    Then User should login successfully

  Scenario: View the Budget Page
    When Click the Budget
    And Click the SetupBudget
    Then Click the BudgetProjects

  Scenario: Create new Budget
    When Click the addButton
    Then write the nameA
    And write the code
    And click the optionButton
    Then click the saveButton
    Then see the success messageA

  Scenario: Delete the Budget
    When click the nameLine1
    Then write the nameB
    And click the searchButton
    Then click the deleteButton
    And click the yesButton
    Then see the success messageB