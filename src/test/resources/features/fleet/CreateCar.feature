Feature: As a user, I want to be able to create new cars

  @add_car_scenario_outline
  Scenario Outline:  Add some car with <licence plate> plates and <model year> year
    Given user is on the login page
    And user logs in as a "store manager"
    And user navigates to "Fleet" and "Vehicles"
    And user clicks on create car button
    When user adds new vehicle information
      | License Plate | <licence plate> |
      | Model Year    | <model year>    |
    And user clicks on save and close button

    Examples: auto test data
      | licence plate | model year | role          |
      | Florida       | 2020       | store manager |
      | QA            | 2021       | store manager |
      | RAMAZAN       | 2030       | store manager |
      | SDET          | 1999       | store manager |

