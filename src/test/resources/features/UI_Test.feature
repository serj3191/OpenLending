
Feature: verify slogan under the logo

  Scenario: verify slogan

    When user is on Google page
    And user searches for "Open Lending"
    And user sees LinkedIn page of the company
    And user clicks on LinkedIn page link
    Then user is redirected to that page
    And user sees "Say YES to more automotive loans." message under the logo