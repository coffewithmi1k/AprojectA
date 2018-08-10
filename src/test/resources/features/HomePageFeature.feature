Feature: Home Page tests

  Scenario: Check Home Page is opened
    Given user opens HomePage
    Then verifies HomePage is opened

  Scenario: Check Main Logo redirects to HomePage
    Given user opens HomePage
    And user click main Logo
    Then verifies HomePage is opened
@run
  Scenario: Check Locale can be changed
    Given user opens HomePage
    And  use choose locale Norway
    Then verifies Norway Home Page is opened


  Scenario: Check that proper categories are present
    Given user opens HomePage
    Then verifies all needed categories are present on the page

  Scenario: Check that Best Artist block is present
    Given user opens HomePage
    Then verifies Best Artist block is present on the page

  Scenario: Check that User is able to scroll Best Artist block
    Given user opens HomePage
    And user clicks left Best Artist block arrow
    And verifies block page is changed
    And user clicks right Best artist block arrow
    Then verifies block page is changed

  Scenario: check that search is visible on the Home Page
    Given user opens HomePage
    Then verifies Search is present on the page

  Scenario: Check "Why choose us" block is present
    Given user opens HomePage
    Then verifies Why choose us block is present

  Scenario: Become an Artist button in Join Artist block
    Given user opens HomePage
    And clicks Become an Artist link
    Then verifies sign up form is opened with preselected choice for Artist

  Scenario: Check How we work block present
    Given user opens HomePage
    Then verifies How we work block is present

  Scenario: Check Some little story block is present
    Given user opens HomePage
    Then verifies SOme little story text is present and correct