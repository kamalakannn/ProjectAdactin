Feature: Hotel Booking WebApplication
@SomkeTest
Scenario Outline: Login Functionality checking

Given User Lanch the Application
When  User Enter the "<Username>" in the User name tab
And  Usr Enter the "<Password>" in the Password Tab
Then User Click the Login Button and go to Search Hotel Web Page

Examples:
|Username|Password|
|abc|1234|
|bcd|45678|
|kamalaka267|Kamal@267|

@IntegrationTest
Scenario: Search Hotel 
When User click the Location
And User Click the Hotel 
And User Click the Room Type
And User Click the Number Of Room
And User Enter the Check-In Date
And User Enter the Check-out Date
And User Click the Adult Room
And User Click the Children Room
Then User Click the Search Button and go to Continue Hotel

Scenario: Continue Hotel
When User Click the Select Button
Then user click the Continue Button and go to Booking Page

Scenario: Booking Hotel Functionality Checking
When user Enter the first name in the First Name tab
And  user Enter the last name in the last name tab
And  user Enter the Billing Address in the Billing Address tab
And user Enter the Creit Card Number in the Credit Card Number tab
And user Click the Creit Card Type in the Credit Card type tab
And user Select the Select month and Select Years in the Expriy Date Tab
And user Enter the CVV number in the CVV number tab 
Then User click the Book Now button and go to the Confirmation Web Page

Scenario: Conirmation Hotel Functionlity Checking
Then  User click the Logout Button and go to Login page

