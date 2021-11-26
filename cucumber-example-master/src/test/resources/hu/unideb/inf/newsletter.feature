Feature: Testing the Main Page email

  Background:
    Given the home page is opened

  Scenario:
    Given the email address filled with "some"
    When the Email button is clicked
    Then the "Newsletter : Invalid email address." error message shown


