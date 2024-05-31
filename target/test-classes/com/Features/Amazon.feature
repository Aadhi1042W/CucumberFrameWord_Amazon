Feature: Amazon Purchase

Scenario: User Login With The Username And Password In Amazon Page And purchase Products
Given User Land On The Amazon Page
When  User Click The SignIn Button
When  User Enter the Username In The Username Field "jayaaadhithya@gmail.com"
And  User click The Continue Button And Navigate To Password Page
And User Enter The Password In The Password Field "jaya1395"
And User Click The SignIn Button And Navigate To The Home Page
Then User Land On The Amazon Homepage


Scenario Outline: User Search The Product And Add The Product In The Cart
When User Click The Search Box And Enter The Product Name "<Products>"
And User Click The Search Button And Navigate to the Product List Page
And User Select The Product In The List And navigate To The Product Details Page
And User Click The Add To Cart Button  And Get The Window Popup In The Current page
And User Click The Cart Button  and Navigate To the Cart Page
Then User Lands On The Cart Page

Examples:

|Products|
|lenovo ideapad slim 5|
|samsung s24 ultra 5g|
|redmi note 13 pro|


Scenario: User Makes Payment And Failed In The Process
When User Click The Cart Button And Navigates to the Cart Page
And User Clicks THe Proceed To Pay Button And Navigates To The CheckOut Page
And User Click The Use This Address Button 
And User Clicks The PaymentMethod ratio Button And Click The Enter Card Details Button And New PopUp frames opens
And User Changes Frame And Click Card Number Button And Pass The Value"1234 4567 789"  
Then User Click The Enter Button and Gets THere Was A Problem Message



