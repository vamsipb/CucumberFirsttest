Feature: to be able to create account in Basketball England
  Scenario: to ensure that account is created with given credentials
    Given the valid date of birth and firstname and lastname and email
    When i enter password and conform password
   And i check on required boxes
    Then  the account is created


  Scenario: lastname not found
    Given the valid date of birth and firstname and email
    When i enter the password and conform password
    And i check on  the required boxes and click on create account
    Then i get missing lastname error

  Scenario: incorrect password
    Given i enter date of birth and firstname and lastname
    And i enter email and conform email
    When i enter the password and conform wrong password
    And i check on all the required boxes and click on create account
    Then i get password did not match message

  Scenario: terms and conditions not accepted
    Given i enter the date of birth and firstname and lastname
    And i enter the email and then conform email
    When i enter the password and conform the password
    And i check on all the required boxes except terms and conditions checkbox and click on create account
    Then i get You must confirm that you have read and accepted our Terms and Conditions