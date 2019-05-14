Feature: Test title of the home page

  Scenario: Title of the page is
    Given user is on ogin page
    When user enter username and passowrd
    And click on login button
    Then user should be able to see the title of the page
