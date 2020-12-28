Feature:Create New Attestations

  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully

  Scenario: User  should be able to create attestations and view  successfully validating the message

    And  User click on the element in dialogcontent
      | humanResources      |
      | humanResSetupButton |
      | attestations        |


  Scenario: User  should be able to create attestations and view  successfully validating the message

    And  User click on the element in dialogcontent
      | humanResources |
      | setupOne       |
      | attestations   |

    And  User click on the element in dialogcontent
      | addButton |
    And User sending the keys
      | name1 | kemalD |

    And  User click on the element in dialogcontent
      | saveButton |
    Then Userr should see "succes" message


  Scenario: User should be able to edit the Document and view  successfully validating the message

    And  User click on the element in dialogcontent
      | humanResources |
      | setupOne       |
      | attestations   |

    Then  User "edit" "kemalD"

    And User sending the keys
      | name1 | Kemal12 |
    And  User click on the element in dialogcontent
      | saveButton |
    Then Userr should see "succes" message

  Scenario: User should be able to search the Document and delete it and successfully validated the message

    And  User click on the element in dialogcontent
      | humanResources |
      | setupOne       |
      | attestations   |

    Then  User "delete" "kemal12"
    And  User click on the element in dialogcontent
      | yesButton |
    Then Userr should see "succes" message


  Scenario: User should be able to search the Document and delete it and successfully validated the message

    And  User click on the element in dialogcontent
      | humanResources |
      | setupOne       |
      | attestations   |

    And User sending the keys
      | nameSearch | Kemal12 |

    And  User click on the element in dialogcontent
      | searchButton |

    Then  User "delete" "kemal12"

    And  User click on the element in dialogcontent
      | yesButton |
    Then Userr should see "succes" message

