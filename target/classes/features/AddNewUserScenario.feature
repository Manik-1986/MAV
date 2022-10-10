Feature: Creating new user
  Scenario: Add a new user
  Given  user on web
    Then user should see home work
    And user click Add user  button to create new user
    Then user should see input field
    And user create new user with mock date
