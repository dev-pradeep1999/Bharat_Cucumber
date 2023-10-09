Feature: Login

  Scenario: Sucessfull Login with valid Credentials
    Given User Launch Chrome browser
    When user enters Facility Code, UserName and Password
    Then close browsers

  Scenario: Search for a valid patient name
    Given User Launch Chrome browser
    When user enters Facility Code, UserName and Password
    Then user is enter the valid patient name, contact, LABUID and HospitalId
    Then close browsers

  Scenario: Login with invalid Credentials
    Given User Launch Chrome browser
    And invalid username and enters invalid Facility Code, UserName and Password
    Then close browsers

  Scenario: Sucessfull Login with valid Credentials
    Given User Launch Chrome browser
    When user enters Facility Code, UserName and Password
    Then close browsers
