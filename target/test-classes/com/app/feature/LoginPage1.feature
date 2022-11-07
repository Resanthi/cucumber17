@scenariooutline
	Scenario Outline: Validate the invalid username and invalid password 

	Given Enter the URL
	When Enter the username "<username>"
	And Enter the password "<password>"
	And Click the login button
	Then Validate the Home page title

Examples:
		|username|password|
		|Aiite1|abd123|
		|Aiite2|abgt123|


#@scenariooutline
 #   Scenario Outline: Validate the invalid username and valid password
		
	#	When Enter the user "<username>"
	#	And Enter the pass "<password>"
	#	And Click the login button
	#	Then Validate the Home page title
		
		#Examples:
		#|username|password|
		#|Aiite1|abcd123|
		#|Aiite2|abgt123|
