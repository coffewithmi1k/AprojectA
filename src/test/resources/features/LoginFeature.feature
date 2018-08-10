Feature: Log in Tests

  Scenario: Check user is able to log in with valid creds
    Given user opens HomePage
    And user opens log in pop-up
    And inserts "qcoffe1@mailinator.com" as login and "qwe1156q" as password
    And clicks on Log in button
    Then verifies user is logged in successfully

  Scenario: Check that proper error message is received when user tries to log in with empty form
    Given user opens HomePage
    And user opens log in pop-up
    And clicks on Log in button
    Then verifies error message "" is displayed

  Scenario: Check that user is not able to log in with invalid creds
    Given user opens HomePage
    And user opens log in pop-up
    And inserts "asdasdasd" as login and "qweqweqweqwe" as password
    And clicks on Log in button
    Then verifies error message "" is displayed

  Scenario: check that user is not able to log in with only Login
    Given user opens HomePage
    And user opens log in pop-up
    And inserts "qcoffe2@mailinator.com" as email
    And clicks on Log in button
    Then verifies error message "" is displayed

    Scenario: Check user is not able to log in with only password
      Given user opens HomePage
      And user opens log in pop-up
      And inserts "qcoffe2@mailinator.com" as password
      And clicks on Log in button
      Then verifies error message "" is displayed

      Scenario: check Sign up form is opened , when user clicks "Don't have an account?"
        Given user opens HomePage
        And user opens log in pop-up
        And user clicks "Sign up" link
        Then verifies signup form is opened.