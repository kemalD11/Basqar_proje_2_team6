Feature:Create New Attestations

  Background:
    Given Navigate to basqar

    When Enter username and password and click Login Button


  Scenario: User  should be able to create attestations and view  successfully validating the message

    And Navigate to Education Left page
      | HumanResources      |
      | humanResSetupButton |
      | attestations        |


  Scenario: User  should be able to create attestations and view  successfully validating the message

    And Navigate to Education Left page
      | HumanResources |
      | humanResSetupButton |
      | attestations   |

    And  Navigate a new Subject create and save
      |  addButton |
    And Create a new Subject send Keys
      |  name1 | kemalD |

    And  Navigate a new Subject create and save
      |  saveButton |
    Then User should login successfully
