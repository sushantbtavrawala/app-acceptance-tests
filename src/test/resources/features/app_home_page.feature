@home_page @wip
Feature: Check Ebay Home Page

  Background: : Check navigation to ebay home page
    Given I navigate to the ebay home page
    Then I will be on the "eBay" page
  @browserstack
  Scenario: Check navigation to the ebay'fashion' page
    When I click on the "Fashion" link
    Then I will be on the "Fashion" page

  Scenario: Check navigation to the ebay 'Home & Garden' page
    When I click on the "Home & Garden" link
    Then I will be on the "Home Garden" page

  Scenario: Check navigation to the ebay 'Electronics' page
    When I click on the "Electronics" link
    Then I will be on the "Electronics" page

  Scenario: Check navigation to the ebay 'Sports & Leisure' page
    When I click on the "Sports & Leisure" link
    Then I will be on the "Sports, Hobbies & Leisure" page

  Scenario: Check navigation to the ebay 'Collectables' page
    When I click on the "Collectables" link
    Then I will be on the "Collectables & Art" page

  Scenario: Check navigation to the ebay 'Health & Beauty' page
    When I click on the "Health & Beauty" link
    Then I will be on the "Health & Beauty" page

