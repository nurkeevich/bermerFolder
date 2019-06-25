@feature32567
Feature: LetsKodeIt Practice page feature

  @id1
  Scenario: Check if User is able to select more than one Radio Button option
    Given Radio Button Example with three options
    When User selects "BMW" and "Benz"
    Then Error message should be displayed

    @id2
    Scenario: Switch To Alert test scenario
      Given User locates Switch to Alert Button using Xpath and enters credentials
      When User clicks the  button for alert popup box
      Then User gets the displayed text of the alert popup and prints it to console
      And User accepts the alert popup
      And User locates Confirm Button using Xpath
       Then User dismisses the confirm popup
      And User accepts the confirm popup



