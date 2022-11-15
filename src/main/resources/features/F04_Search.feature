@smoke
Feature: search feature test
  Scenario Outline: user can search by product name
    When user click on search field
    And user search with "<productName>"
    Then user could find "<productName>" relative results
    Examples:
      |productName  |
    |book         |
    |laptop       |
    |nike         |

  Scenario Outline: use can search using sku
    When user click on search field
    And user search by "<sku>"
    Then user could find by "<sku>" relative results
    Examples:
      |sku  |
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|
