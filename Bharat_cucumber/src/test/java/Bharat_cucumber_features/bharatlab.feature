	Feature: Add Patient

  #Scenario: Sucessfull Login with valid Credentials
    #Given User Launch Chrome browser
    #When user opens url "http://155.248.241.228:7300"
    #When user enters Facility Code as "bharatlab", UserName as "admin" and Password as "demo123"
    #Then the user clicks on Add Patient button
    #When the user enters the patient details
      #| Field | Title  | First Name | Middle Name | Last Name | Gender | Age | Date of Birth | Mobile     | Relation Type | Emergency Contact Name | Emergency Contact Number | Village / Ward | Block / Tehsil | District | State         | Hospital UHID | Aadhaar No.  |
      #| Value | Select | Samar      | Kuamr       | Pawar     | Male   |  12 | 07-05-05      | 9586325264 | dropdown      | Dharmesh               |               9876543210 | Multai         | Betul          | VARANASI | Uttar Pradesh |     123456789 | 123456789012 |
    #Then user select the test from drop-down as "LIPID PROFILE REPORT" , "BLOOD" , "RENAL" and "RA FACTOR"
    #Then user enter the visit type as "IPD"
    #Then user click on save and generate button
    #Then user enter the test barcode as "5260003914", "2593147425", and "5824139745"
    #Then click on save button
    #Then user click on back button
    #Then close browser

  #Scenario: Print console search funcationality on the basis of start and end date
    #Given User Launch Chrome browser
    #When user opens url "http://155.248.241.228:7300"
    #When user enters Facility Code as "bharatlab", UserName as "admin" and Password as "demo123"
    #Then user click on print console left panel button
    #Then user select the start date as "09-08-2023"
    #Then user select the end date as "12-08-2023"
    #Then user enter the order Number as "00000134"
    #Then user enter the lab number as "0012554"
#	   Then user click on search button
    #Then user select the patient type
    #Then user select the visit type
    #Then user is select the ward
    #Then close browser

  Scenario: verify the lab work Sample collection functionality
    Given User Launch Chrome browser
    When user opens url "http://155.248.241.228:7300"
    When user enters Facility Code as "ALIR01AL001", UserName as "admin" and Password as "demo123"
    Then user click on lab work left panel menu
    Then user click on sample collection work list
    Then user select the start date as "05-08-2023", end date as "11-08-2023" , orderNo as "00000136", labNo as "00000005" and firstname as "MANOJ"
    Then user click on Collection sample button
    Then user click on print barcode button
    
    
  #Scenario: verify the lab work Micrpbiology functionality  
  #Given User Launch Chrome browser
    #When user opens url "http://155.248.241.228:7300"
    #When user enters Facility Code as "bharatlab", UserName as "admin" and Password as "demo123"
    #Then user click on lab work left panel menu2
    #Then user select the start date as "05-08-2023", end date as "11-08-2023" , orderNo as "00000136", labNo as "00000005" and barcode as "4521458741"
   # Then click on search button
    #Then user 
    
