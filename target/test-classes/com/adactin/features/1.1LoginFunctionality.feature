Feature: Hotel Booking using Adactin Application

Scenario: Login Functionality
Given user launches the application
When user enters the valid username
And user enters the valid password
Then user click the login button and user navigates to the search hotel page

Scenario: Search Hotel Functionality
When user select the location from the dropdown
And user selects the Hotel from the dropdown
And user select the roomtype from the dropdown
And user select the number of rooms
#And user select the checkindate
#And user select the checkoutdate
And user select the Adultsperroom
And user select the childrenperroom
Then user click the search button and navigates to select hotel page

Scenario: Select Hotel Functionality
When user click the radio button
Then user click the continue button and navigates to book hotel page

Scenario: Book Hotel Functionality
When user enters the first name
And user enters the last name
And user enters the billing address
And user enters the credit card number
And user select the credit card type 
And user select the expiry date for month
And user select the year from dropdown
And user enters the cvv number
And user click the booknow button 
Then user click the myItinerary button and navigates to Booked Itinerary

Scenario: Logout Functionality
When user click the logout button

