Feature: JBK offline application test
@kiran
Scenario: login test

Given user on login page
When user enters valid credentials
Then user should be on home page

@kiran
Scenario: logo test

Given user on login page
Then user should see JBK logo