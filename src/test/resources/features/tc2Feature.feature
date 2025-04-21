Feature: Verify modifications in Google Sheet

  Scenario: Modifying a test cell
    Given I have opened the Google Sheet
    When I modify the test cell with new data
    Then the modification should be saved correctly