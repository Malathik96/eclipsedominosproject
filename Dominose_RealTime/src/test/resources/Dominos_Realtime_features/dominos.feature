Feature: To launch the dominos and order the items

  Scenario: Login the webpage order the beverages and pizzas
    Given login the url
    When Click on Order Online
    And Click on location button and enter the location details
    And To select the veg pizzas and Beverages
    And To remove the Qty of the order in the add to cart
    Then Checkout the order and close the window
