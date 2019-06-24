Feature: LetsKodeIt Practice page feature

  @id1
  Scenario: Check if User is able to select more than one Radio Button option
    Given Radio Button Example with three options
    When User selects "BMW" and "Benz"
    Then Error message should be displayed

    Scenario: Switch Window Test Scenario
      Given User selects Open Window button
      When
      Then


