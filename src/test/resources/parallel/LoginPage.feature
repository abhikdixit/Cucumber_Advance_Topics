Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Web Orders"

Scenario: Login with correct credentials
Given user is on login page
When user enters username "Tester"
And user enters password "test"
And user clicks on Login button
Then user gets the title of the page
And page title should be "Web Orders"