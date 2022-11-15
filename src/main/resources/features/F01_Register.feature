@regression
  Feature: user should be able to create a new account
    Background: user open browser and navigate to registration page
      And user navigate to registration page

    Scenario: user create a new account successfully
      Given user open browser
      When user enter required info
      And user click on register
      Then user account will be created
      And user will navigate to home page
