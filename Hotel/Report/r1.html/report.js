$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Scenario.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking WebApplication",
  "description": "",
  "id": "hotel-booking-webapplication",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Functionality checking",
  "description": "",
  "id": "hotel-booking-webapplication;login-functionality-checking",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SomkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Lanch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter the \"\u003cUsername\u003e\" in the User name tab",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Usr Enter the \"\u003cPassword\u003e\" in the Password Tab",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click the Login Button and go to Search Hotel Web Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-webapplication;login-functionality-checking;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "hotel-booking-webapplication;login-functionality-checking;;1"
    },
    {
      "cells": [
        "abc",
        "1234"
      ],
      "line": 12,
      "id": "hotel-booking-webapplication;login-functionality-checking;;2"
    },
    {
      "cells": [
        "bcd",
        "45678"
      ],
      "line": 13,
      "id": "hotel-booking-webapplication;login-functionality-checking;;3"
    },
    {
      "cells": [
        "kamalaka267",
        "Kamal@267"
      ],
      "line": 14,
      "id": "hotel-booking-webapplication;login-functionality-checking;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login Functionality checking",
  "description": "",
  "id": "hotel-booking-webapplication;login-functionality-checking;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SomkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Lanch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter the \"abc\" in the User name tab",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Usr Enter the \"1234\" in the Password Tab",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click the Login Button and go to Search Hotel Web Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_Lanch_the_Application()"
});
formatter.result({
  "duration": 4324775200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "Step.user_Enter_the_in_the_User_name_tab(String)"
});
formatter.result({
  "duration": 507535500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 15
    }
  ],
  "location": "Step.usr_Enter_the_in_the_Password_Tab(String)"
});
formatter.result({
  "duration": 374949100,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Login_Button_and_go_to_Search_Hotel_Web_Page()"
});
formatter.result({
  "duration": 923333400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login Functionality checking",
  "description": "",
  "id": "hotel-booking-webapplication;login-functionality-checking;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SomkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Lanch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter the \"bcd\" in the User name tab",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Usr Enter the \"45678\" in the Password Tab",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click the Login Button and go to Search Hotel Web Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_Lanch_the_Application()"
});
formatter.result({
  "duration": 505069400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bcd",
      "offset": 16
    }
  ],
  "location": "Step.user_Enter_the_in_the_User_name_tab(String)"
});
formatter.result({
  "duration": 190554900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "45678",
      "offset": 15
    }
  ],
  "location": "Step.usr_Enter_the_in_the_Password_Tab(String)"
});
formatter.result({
  "duration": 182536600,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Login_Button_and_go_to_Search_Hotel_Web_Page()"
});
formatter.result({
  "duration": 756911100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Functionality checking",
  "description": "",
  "id": "hotel-booking-webapplication;login-functionality-checking;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@SomkeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Lanch the Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Enter the \"kamalaka267\" in the User name tab",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Usr Enter the \"Kamal@267\" in the Password Tab",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Click the Login Button and go to Search Hotel Web Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_Lanch_the_Application()"
});
formatter.result({
  "duration": 369156500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kamalaka267",
      "offset": 16
    }
  ],
  "location": "Step.user_Enter_the_in_the_User_name_tab(String)"
});
formatter.result({
  "duration": 224743200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kamal@267",
      "offset": 15
    }
  ],
  "location": "Step.usr_Enter_the_in_the_Password_Tab(String)"
});
formatter.result({
  "duration": 161896600,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Login_Button_and_go_to_Search_Hotel_Web_Page()"
});
formatter.result({
  "duration": 1212815100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-webapplication;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@IntegrationTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User click the Location",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User Click the Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Click the Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Click the Number Of Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Enter the Check-In Date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Enter the Check-out Date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Click the Adult Room",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Click the Children Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Click the Search Button and go to Continue Hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_click_the_Location()"
});
formatter.result({
  "duration": 392685400,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Hotel()"
});
formatter.result({
  "duration": 332602700,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Room_Type()"
});
formatter.result({
  "duration": 223477700,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Number_Of_Room()"
});
formatter.result({
  "duration": 225194000,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Enter_the_Check_In_Date()"
});
formatter.result({
  "duration": 184297300,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Enter_the_Check_out_Date()"
});
formatter.result({
  "duration": 177305600,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Adult_Room()"
});
formatter.result({
  "duration": 276168100,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Children_Room()"
});
formatter.result({
  "duration": 245206200,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Search_Button_and_go_to_Continue_Hotel()"
});
formatter.result({
  "duration": 1033573000,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Continue Hotel",
  "description": "",
  "id": "hotel-booking-webapplication;continue-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "User Click the Select Button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user click the Continue Button and go to Booking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_Click_the_Select_Button()"
});
formatter.result({
  "duration": 391068800,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_click_the_Continue_Button_and_go_to_Booking_Page()"
});
formatter.result({
  "duration": 1280231400,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Booking Hotel Functionality Checking",
  "description": "",
  "id": "hotel-booking-webapplication;booking-hotel-functionality-checking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user Enter the first name in the First Name tab",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Enter the last name in the last name tab",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter the Billing Address in the Billing Address tab",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter the Creit Card Number in the Credit Card Number tab",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Click the Creit Card Type in the Credit Card type tab",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select the Select month and Select Years in the Expriy Date Tab",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Enter the CVV number in the CVV number tab",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "User click the Book Now button and go to the Confirmation Web Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_Enter_the_first_name_in_the_First_Name_tab()"
});
formatter.result({
  "duration": 857413900,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Enter_the_last_name_in_the_last_name_tab()"
});
formatter.result({
  "duration": 643112400,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Enter_the_Billing_Address_in_the_Billing_Address_tab()"
});
formatter.result({
  "duration": 658347600,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Enter_the_Creit_Card_Number_in_the_Credit_Card_Number_tab()"
});
formatter.result({
  "duration": 438713300,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Click_the_Creit_Card_Type_in_the_Credit_Card_type_tab()"
});
formatter.result({
  "duration": 273407300,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Select_the_Select_month_and_Select_Years_in_the_Expriy_Date_Tab()"
});
formatter.result({
  "duration": 808403800,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_Enter_the_CVV_number_in_the_CVV_number_tab()"
});
formatter.result({
  "duration": 245803900,
  "status": "passed"
});
formatter.match({
  "location": "Step.user_click_the_Book_Now_button_and_go_to_the_Confirmation_Web_Page()"
});
formatter.result({
  "duration": 187956200,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Conirmation Hotel Functionlity Checking",
  "description": "",
  "id": "hotel-booking-webapplication;conirmation-hotel-functionlity-checking",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 43,
  "name": "User click the Logout Button and go to Login page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_click_the_Logout_Button_and_go_to_Login_page()"
});
formatter.result({
  "duration": 1086638800,
  "status": "passed"
});
});