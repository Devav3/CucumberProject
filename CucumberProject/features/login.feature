Feature: User login

  @regression @sanity
  Scenario: account login 
    Given user is on the login page
    When user enters credentials(username:"test@gmail.com",password:"test@123")
    Then user navigates to account home page
    And  user sees welcome message


   @sanity
  Scenario: account login1 
    Given user is on the login page1
    When user enters credentials2
    |firstName|JK|
    |lastName|KV|
    |address|33 Julius|
    Then user navigates to account home page2
    And  user sees welcome message2
    
 @multi
  Scenario Outline: account login 2
    Given user is on the login page
    When user enters credentials as "<email>" and password as "<password>"
    Then user navigates to account home page
    And  user sees welcome message
    
    Examples:
			|email|password|
			|Varsha|Kukkudus|
			|Kukkudu|AchaAmma|
    