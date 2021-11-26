Feature: Create account page test

  Background:
    Given the home page is opened
    And the Sign In link is clicked

    Scenario:
      Given Email address is filled with "" address
      When  Create an account button is clicked
      Then  "Invalid email address." message is showed

    Scenario Outline:
      Given  '<field>' filled with '<parameters>'
      And the Create an Account button is clicked
      Given second '<area>' filled with '<params>'
      And third '<section>' filled with '<parameter>'
      And fourth '<part>' filled with '<text>'
      When Register Button is clicked
      Then '<msg>' should be shown

      Examples:
        | field        | parameters   | area                 | params | section             | parameter | part     | text | msg                |
        | email_create | some@mail.ru | customer_firstname   |        | customer_lastname   |           | passwd   |      | There are 8 errors |
        | email_create | some@mail.ru | customer_firstname   | Jasey  | customer_lastname   |           | passwd   |      | There are 7 errors |
        | email_create | some@mail.ru | customer_firstname   | Jasey  | customer_lastname   | Jacklin   | passwd   |      | There are 6 errors |
        | email_create | some@mail.ru | customer_firstname   | Jasey  | customer_lastname   | Jacklin   | passwd   | 123456 | There are 5 errors |