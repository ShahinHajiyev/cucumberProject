Feature: T`shirts test

  Background:
    Given the home page is opened

    Scenario:
      Given Tshirts button is clicked
      And list button is clicked
      When ADD to cart button is clicked
      Then "" error message is shown
