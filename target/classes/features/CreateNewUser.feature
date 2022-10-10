Feature: Create new user functionality


Background: Land to Home page
    Given Go to login page
    Given Enter "manik-1986@ya.ru" in userName or Email input field
    And Enter "Papa010454" in password input field
    When user click on login button
    Then user should successfully logged in


  Scenario: Positive: Create new user
    Given user should click Add user button in admin Home page
    And verify following field names are display\
      | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
    And enter following data to create new user
      | firstname | lastname | emailAddress   | Username | password  |
      | Elon      | Musk     | musl@tesla.com | elaon    | Very55Fun |
      | Leo       | Messi    | messi@rew      | messi    | Very55Fun |

