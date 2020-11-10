Feature: As user, I want to be able to create calender events

  Scenario: Create calender event with default time
  Given user is on the login page
  And user logs in as a "store manager"
  And user navigates to "Activities" and "Calender Events"
  And user clicks on create calender event button
  When user adds new calender event information
    | Title       | B20 Graduation Party                        |
    | Description | All B20 friends are invited for this party! |
  And user clicks on save and close button
  Then user verifies that new calender event is displayed:
    | Title       | B20 Graduation Party                        |
    | Description | All B20 friends are invited for this party! |






