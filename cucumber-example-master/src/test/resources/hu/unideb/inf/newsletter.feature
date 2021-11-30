Feature: Testing the Main Page email

  Background:
    Given the home page is opened

  Scenario Outline:
    Given the '<area>' email address filled with '<parameter>'
    When the Email button is clicked
    Then the '<message>' error message shown
    Examples:
      | area                 | parameter             | message |
      |  newsletter-input    |  some                 | Newsletter : Invalid email address.        |
      |  newsletter-input    |  hshahin.t401@code.edu.az         | Newsletter : This email address is already registered.|
      |  newsletter-input    |  tamm@gmail.com      | Newsletter : You have successfully subscribed to this newsletter.                                                      |


