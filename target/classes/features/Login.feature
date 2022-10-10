Feature: Login functionality

  Background: Land to Home page



    @smoke
    Scenario: Positive Login with valid credential as Admin
      Given Enter "manik-1986@ya.ru" in userName or Email input field
      And Enter "Papa010454" in password input field
      When user click on login button
      Then user should successfully logged in




