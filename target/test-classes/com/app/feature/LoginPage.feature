Feature: Login PageTesting
@user

@userisai
Scenario: Validate the valid username and password

Given Enter the URL
When Enter the Username
And Enter the Password
And Click the LoginButtton
Then Validate the Search Hotel Page

@userunknown
Scenario: Validate the valid username and password

Given Enter the URL "https://adactinhotelapp.com/index.php"
When Enter the Username "isaipriyan"
And Enter the Password "Isai5496"
And Click the LoginButtton
Then Validate the Search Hotel Page




