Feature: All Steps


  Scenario: Step By Step from Dismissal Articles


    Given Navigate to basqar
    When Enter username and password and click Login button

    Then Navigate to Education Left page
      | HumanResources                 |
      | SetupButtonUnderHumanResources |
      | DismissalArticles              |
    And  Navigate a new Subject create and save
      | addButton |
    When Create a new Subject send Keys
      | nameInput | Yusuf_Java |
    When Create a new Subject send Keys
      | DescriptionInput | Yusuf_Developer |
    And  Navigate a new Subject create and save
      | saveButton |
    Then User should login successfully
    When Create a new Subject send Keys
      | dismissalArticlesNameInputSearch | Yusuf_Java |
    And Navigate a new Subject create and save
      | searchButton |
    And  Navigate a new Subject create and save
      | editButton |
    When Create a new Subject send Keys
      | nameInput | Yusuf_Selenium |
    When Create a new Subject send Keys
      | DescriptionInput | Yusuf_Entwickler |
    And  Navigate a new Subject create and save
      | saveButton |
    Then User should login successfully
    When Create a new Subject send Keys
      | dismissalArticlesNameInputSearch | Yusuf_Selenium |
    And  Navigate a new Subject create and save
      | searchButton |
    And Delete Subject Categories
      | deleteButton |
      | yesButton    |
    Then User should login successfully