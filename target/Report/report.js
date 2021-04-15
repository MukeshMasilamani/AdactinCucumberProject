$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/FeatureFiles/Flow.feature");
formatter.feature({
  "name": "Adactin hotel booking room functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To check flow of Adactin hotel booking room functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User in adcatin login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter valid username and valid password",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "MukeshMasailamani",
        "Since@1995"
      ]
    }
  ]
});
formatter.step({
  "name": "User click login button and user should navigate to search hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User select all require field",
  "keyword": "And "
});
formatter.step({
  "name": "User click search button and should navigate to select hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User select hotel in list and click continue and user should be navigate to book hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "user enter details \"\u003cfirst name\u003e\",\"\u003clast name\u003e\",\"\u003cbilling address\u003e\",\"\u003ccredit card no\u003e\",\"\u003ccard type\u003e\",\"\u003cexpire date\u003e\", \"\u003cexpire year\u003e\",\"\u003ccvv no\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User click Booknow button and navigate to booking confirmation page",
  "keyword": "And "
});
formatter.step({
  "name": "User click my itinerary button then user get order id of booking details",
  "keyword": "And "
});
formatter.step({
  "name": "User click search hotel button moved to home page of search hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "User should be succesflly navigate to search hotel main page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first name",
        "last name",
        "billing address",
        "credit card no",
        "card type",
        "expire date",
        "expire year",
        "cvv no"
      ]
    },
    {
      "cells": [
        "uvaish",
        "Mohamed",
        "GreenTech, perumbakkam ,Chennai.",
        "9874561233216549",
        "VISA",
        "2",
        "2022",
        "895"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To check flow of Adactin hotel booking room functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in adcatin login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_in_adcatin_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter valid username and valid password",
  "rows": [
    {
      "cells": [
        "MukeshMasailamani",
        "Since@1995"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.user_enter_valid_username_and_valid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button and user should navigate to search hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_click_login_button_and_user_should_navigate_to_search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select all require field",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_select_all_require_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click search button and should navigate to select hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_click_search_button_and_should_navigate_to_select_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select hotel in list and click continue and user should be navigate to book hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_select_hotel_in_list_and_click_continue_and_user_should_be_navigate_to_book_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter details \"uvaish\",\"Mohamed\",\"GreenTech, perumbakkam ,Chennai.\",\"9874561233216549\",\"VISA\",\"2\", \"2022\",\"895\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_enter_details(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Booknow button and navigate to booking confirmation page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_click_Booknow_button_and_navigate_to_booking_confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click my itinerary button then user get order id of booking details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_click_my_itinerary_button_then_user_get_order_id_of_booking_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click search hotel button moved to home page of search hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_click_search_hotel_button_moved_to_home_page_of_search_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be succesflly navigate to search hotel main page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_should_be_succesflly_navigate_to_search_hotel_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});