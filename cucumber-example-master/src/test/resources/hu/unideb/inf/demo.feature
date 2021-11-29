Feature: YourLogo sign in page test

  Background:
    Given the home page is opened
    And the Sign In link is clicked

    Scenario Outline:
      Given the '<field>' is filled with '<parameter>'
      And  '<place>' is filled with '<param>'
      When the Sign In button is clicked
      Then the '<msg>' error message is shown
      Examples:
        | field | parameter         |place        |param| msg                        |
        | email |                   | passwd      |     |An email address required. |
        | email | invalid.email.com | passwd      |     |Invalid email address.     |
        | email | valid@email.com   | passwd      |     |Password is required.      |
        |  email     |  valid@email.com                 | passwd             |123123123     |  Authentication failed.             |
