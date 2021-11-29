Feature: Testing the ContactUs page

  Background:
    Given the home page is opened
    And the Contact Us link is clicked

  Scenario Outline:
    Given the '<field>' is filled with the '<parameter>'
    And the '<area>' is filled w '<param>'
    When the Send button is clicked
    Then the '<msg>' error messages are shown
    Examples:
      | field |  area            |  parameter          |param       | msg                                            |
      | email |  message         |something@mail.ru    | something  |Please select a subject from the list provided. |
      | email |  message         |invalid.email.com    |            | Invalid email address.                         |
      | email |  message         |valid@email.com      |            |The message cannot be blank.                    |

