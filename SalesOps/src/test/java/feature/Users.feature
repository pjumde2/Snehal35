Feature: Users Tab Functionalities

@RegressionTest
Scenario: Verify that User able to Search with Name of User in Users Tab
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
Then Users Records should diplay "Nakshj Nikhade"


@RegressionTest
Scenario: Verify that User able to search By Name in Users Tab
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Name of User Textbox
Then Users Records should diplay "Nakshj Nikhade"


@RegressionTest
Scenario: Verify that User able to search By UserName in Users Tab
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh.nkhade@xpo.com" in Username Textbox
Then Users Records should diplay with Username "naksh.nkhade@xpo.com"



@RegressionTest
Scenario: Verify that User able to search By Email in Users Tab
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh1.nkhade@xpo.com" in Email Textbox
Then Users Record should diplay with Email Id "naksh1.nkhade@xpo.com"


@RegressionTest
Scenario: Verify that User able to search By Phone Number in Users Tab
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "9978654344" in Phone Number Textbox
Then Users Record should diplay with Phone Number "9978654344"


@RegressionTest
Scenario: Verify that User able to search By Zip Code in Users Tab
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "88889" in Zip Code Textbox
Then Users Record should diplay with Zip Code "88889"


@RegressionTest
Scenario: Verify that we can Add New User in Sales Ops
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "niraj.bhaske7@xpo.com"
When I enter First Name as "Niraj"
When I enter Last Name as "Baban"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786543234"
When I click on Submit button


@RegressionTest
Scenario: Verify that we can Add New User in Sales Ops with Role as Shipping Only
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "niraj.bhaske50@xpo.com"
When I enter First Name as "Niraj"
When I enter Last Name as "Baban"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786543234"
When I select Role as "Shipping Only"
When click on Record Edit button
When I enter "test" in Company Name testbox for Adding Locations
When Select the Locations to Add
When Add the Locations
Then Check Locations are added
When I click on Submit button
When I enter "niraj.bhaske50@xpo.com" in Users Textbox
Then User with Shipping Role display



@RegressionTest
Scenario: Verify that we can Add New User in Sales Ops with Role as Shipping And Financial Information
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "kamal.bhasme15@xpo.com"
When I enter First Name as "kamal"
When I enter Last Name as "Baban"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786543235"
When I select Role as Shipping And Financial Information
When click on Record Edit button
When I enter "test" in Company Name testbox for Adding Locations
When Select the Locations to Add
When Add the Locations
Then Check Locations are added
When I click on Submit button
When I enter "kamal.bhasme15@xpo.com" in Users Textbox
Then User with Role as Shipping And Financial Information display



@RegressionTest
Scenario: Verify that we can Add New User in Sales Ops with Role as Custom
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "niraj.bhasme28@xpo.com"
When I enter First Name as "Niraj"
When I enter Last Name as "Baban"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786543236"
When I select Role as Custom
When click on Record Edit button
When I enter "test" in Company Name testbox for Adding Locations
When Select the Locations to Add
When Add the Locations
Then Check Locations are added
When I click on Submit button
When I enter "niraj.bhasme28@xpo.com" in Users Textbox
Then User with Role as Custome display



@RegressionTest
Scenario: Verify that we can Add New User in Sales Ops with Role as Full Access (Admin)
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "manish.bhasme15@xpo.com"
When I enter First Name as "Manish"
When I enter Last Name as "bhasme"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786543237"
When I select Role as Full Access (Admin) display
When click on Record Edit button
When I enter "test" in Company Name testbox for Adding Locations
When Select the Locations to Add
When Add the Locations
Then Check Locations are added
When I click on Submit button
When I enter "manish.bhasme15@xpo.com" in Users Textbox
Then User with Role as Full Access (Admin) display


@RegressionTest
Scenario: Verify that We can Download Users Mapping Data in Excel Sheet
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Download button
Then Excel with Users Mapping Data Downloaded



@RegressionTest
Scenario: Verify that while adding New User, Invalid Email Id should not accept
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "675$%^@&*()"
When I enter First Name as "Niraj"
When I enter Last Name as "Baban"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786543234"
When I click on Submit button
Then We get Error Message



@RegressionTest
Scenario: Verify that while adding New User, Duplicate Email Id should not accept
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "nikhil.kamat@xpo.com"
When I enter First Name as "Niraj"
When I enter Last Name as "Baban"
Then We get Error Message as "Email is already in use"


@RegressionTest
Scenario: Verify that we can Edit Existing Users Email Id
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit Email Id as "naksh1.nkhade@xpo.com"
When click on Submit button
Then Email Id is updated as "naksh1.nkhade@xpo.com"


@RegressionTest
Scenario: Verify that we can Edit Existing Users First Name
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit First Name as "naksh"
When click on Submit button
Then First Name is updated as "naksh"


@RegressionTest
Scenario: Verify that we can Edit Existing Users Last Name
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit Last Name as "Nikhade"
When click on Submit button
Then Last Name is updated as "Nikhade"



@RegressionTest
Scenario: Verify that we can Edit Existing Users Company Name
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit Company Name as "XPO"
When click on Submit button
Then Company Name is updated as "XPO"


@RegressionTest
Scenario: Verify that we can Edit Existing User Street Name 
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit Street Name as "EON"
When click on Submit button
Then Street Name is updated as "EON"




@RegressionTest
Scenario: Verify that we can Edit Existing User City Name
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit City Name as "Eolia"
When click on Submit button
Then City Name is updated as "Eolia"


@RegressionTest
Scenario: Verify that we can Edit Existing User Country Name
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit Country Name as "United States"
When click on Submit button
Then Country Name is updated as "US"




@RegressionTest
Scenario: Verify that we can Edit Existing User State
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit State Name as "Alaksa"
When click on Submit button
Then State Name is updated as "AK"




@RegressionTest
Scenario: Verify that we can Edit Existing User Postal Code
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit Postal Code as "88889"
When click on Submit button
Then Postal Code is updated as "88889"



@RegressionTest
Scenario: Verify that we can Edit Existing User Phone Number
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "naksh" in Users Textbox
When click on Searched Record
When Click on Edit button
When Edit Phone Number as "99786543444"
When click on Submit button
Then Phone Number is updated as "99786543444"



@RegressionTest
Scenario: Verify that User can Activate New Account in Sales Ops
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "marutiy.umesh3@xpo.com"
When I enter First Name as "marutie"
When I enter Last Name as "Babanw"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786540934"
When I click on Submit button
When I enter "marutiy" in Users Textbox
When click on Searched Record
When click on Activate button
Then Check Account is Activated


@RegressionTest
Scenario: Verify that we can Set Password of User
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "marutiq" in Users Textbox
When click on Searched Record
When click on Set Password button
When Entered Password "Dev@123"
When Entered Confirm Password "Dev@123"
When clicked on Set Password button
Then Password get Set Up Successfully



@RegressionTest
Scenario: Verify that We can Reset Password of User
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I enter "marutiq" in Users Textbox
When click on Searched Record
When click on Reset Password button
When click on Confirm Reset Password
Then Email Sent to User for Reset Password


@RegressionTest
Scenario: Verify that we can Deactivate user in Sales Ops
Given I open Browser and enter SalesOps Url
When I click on User Tab
When I click on Add New User button
When I enter Email as "hanumana.umesh3@xpo.com"
When I enter First Name as "hanuman"
When I enter Last Name as "Babanw"
When I enter Company Name as "XPO"
When I enter Street as "EON"
When I select Country as "United States"
When I enter City Name as "Hayward"
When I enter State as "Alaska"
When I enter Postal Code as "4532678"
When I enter Phone as "99786540934"
When I click on Submit button
When I enter "hanumana" in Users Textbox
When click on Searched Record
When click on Activate button
Then Check Account is Activated
When click on Deactivate button
When click on Confirm Deactivate button
Then User become Deactive




