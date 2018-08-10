Feature: Home Page tests

  Scenario: Check Home Page is opened
    Given user opens HomePage
    Then verifies HomePage is opened

  Scenario: Check Main Logo redirects to HomePage
    Given user opens HomePage
    And user click main Logo
    Then verifies HomePage is opened

Scenario: Check Locale can be changed
  Given user opens HomePage
  And  use choose locale "Norway"
  Then verifies Norway Home Page is opened


  Scenario: Check that proper categories are present


    Scenario: Check that Best Artist block is present