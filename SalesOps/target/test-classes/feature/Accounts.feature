Feature: Accounts Tab Functionalities

@RegressionTest
Scenario: Verify that User can able to open any MAC Code in Account tab
Given I open Browser and enter SalesOps Url
When I click on any MAD Code


@RegressionTest
Scenario: Verify that User able to Search Partner Manager with Company Name in Account tab
Given I open Browser and enter SalesOps Url
When I enter "XPO" in Company Name testbox
Then Records should diplay


@RegressionTest
Scenario: Verify that User able to Search Partner Manager  with Account Id in Account tab
Given I open Browser and enter SalesOps Url
When I enter "200654" in Account Id testbox
Then Records should diplay



@RegressionTest
Scenario: Verify that User able to Search Partner Manager  with MAD Code in Account tab
Given I open Browser and enter SalesOps Url
When I enter "XPOLE991022" in MAD Code testbox
Then Records should diplay


@RegressionTest
Scenario: Verify that User able to Search Partner Manager  with City in Account tab
Given I open Browser and enter SalesOps Url
When I enter "ALBERT" in City testbox
Then Records should diplay



@RegressionTest
Scenario: Verify that User able to Search Partner Manager  with Address in Account tab
Given I open Browser and enter SalesOps Url
When I enter "55 INDUSTRIAL LOOP" in Address testbox
Then Records should diplay



@RegressionTest
Scenario: Verify that User able to Search Partner Manager  with Zip Code in Account tab
Given I open Browser and enter SalesOps Url
When I enter "32073" in Zip Code testbox
Then Records should diplay



@WebTest
Scenario: Verify that User able to Search Partner Manager  with State Dropdown in Account tab
Given I open Browser and enter SalesOps Url
When I select state "Alaska"
Then Records should diplay





