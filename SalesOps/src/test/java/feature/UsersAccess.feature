Feature: Add/Remove User Access Page Functionalities


@RegressionTest
Scenario: Verify that User able to search with Company name on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "twill" in Company Name testbox on Add/Remove User Access Page
Then Location Records should diplay with "TWILL USASPECIALTY ADHESIVE FILMS"



@RegressionTest
Scenario: Verify that User able to search with Account ID on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "430" in Account Id testbox on Add/Remove User Access Page
Then Account ID Records should diplay with "430"



@RegressionTest
Scenario: Verify that User able to search with MAD Code on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "ATHDJ001900" in MAD Code testbox on Add/Remove User Access Page
Then MAD Code Records should diplay with "ATHDJ001900"


@RegressionTest
Scenario: Verify that User able to search with City Name on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "SLOVAN" in City testbox on Add/Remove User Access Page
Then Records should diplay with City as "SLOVAN"



@RegressionTest
Scenario: Verify that User able to search with Address on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "28 BAIRD AVE" in Address testbox on Add/Remove User Access Page
Then Records should diplay with Address as "28 BAIRD AVE"



@RegressionTest
Scenario: Verify that User able to search with Zip Code on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "15078" in Zipcode testbox on Add/Remove User Access Page
Then Records should diplay with zipcode as "15078"



@RegressionTest
Scenario: Verify that User can Add and Remove Locations on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "test" in Company Name testbox on Add/Remove User Access Page
When Select the Locations
When Add the Locations
Then Check Locations are added
When click on Record Edit button
When Remove the Location
When Click on Save and Submit button
Then Check Locations are Removed


@RegressionTest
Scenario: Verify that User can Reset Locations on Add/Remove User Access Page
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "Amithj" in Users Textbox
When click on Searched Record
When click on Record Edit button
When I enter "test" in Company Name testbox on Add/Remove User Access Page
When Select the Locations
When Add the Locations
When click on Reset button
Then Check Locations are Reset













