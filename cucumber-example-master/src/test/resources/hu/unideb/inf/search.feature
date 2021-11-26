Feature: The Main Page Search option test

  Background:
    Given the home page is opened

    Scenario:
      Given the search field filled with "T-shirt"
      When the ok button is clicked
      Then "1 result has been found." error message will be shown

    Scenario Outline:
      Given the '<field>' filled with '<parameter>'
      When the ok button is clicked
      Then a '<msg>' error messages are shown

      Examples:
        | field            | parameter         | msg                           |
        | search_query_top |                   | Please enter a search keyword |
        | search_query_top | 31342134134134132 | No results were found for your search "31342134134134132" |
