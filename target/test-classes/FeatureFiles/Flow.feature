Feature: Adactin hotel booking room functionality

  Scenario Outline: To check flow of Adactin hotel booking room functionality
    Given User in adcatin login page
    When User enter valid username and valid password
      | MukeshMasailamani | Since@1995 |
    And User click login button and user should navigate to search hotel page
    And User select all require field
    And User click search button and should navigate to select hotel page
    And User select hotel in list and click continue and user should be navigate to book hotel page
    And user enter details "<first name>","<last name>","<billing address>","<credit card no>","<card type>","<expire date>", "<expire year>","<cvv no>"
    And User click Booknow button and navigate to booking confirmation page
    And User click my itinerary button then user get order id of booking details
    And User click search hotel button moved to home page of search hotel page
    Then User should be succesflly navigate to search hotel main page

    Examples: 
      | first name | last name | billing address                  | credit card no   | card type | expire date | expire year | cvv no |
      | uvaish     | Mohamed   | GreenTech, perumbakkam ,Chennai. | 9874561233216549 | VISA      |           2 |        2022 |    895 |
