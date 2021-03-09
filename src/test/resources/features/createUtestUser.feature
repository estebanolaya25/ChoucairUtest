#Autor: Juan Esteban Olaya

  @stories

  Feature: Client want to create an user in the Utest Page

    @scenario
    Scenario: Create new user on Utest page
      Given user browsed to utest page to create a new utest user
      When  client provide information on the step 1
        | strName  | strLastName  | strEmail  | strMonthBirth | strDayBirth | strYearBirt | strLenguaje  |
      And client clicks in button next location
      Then client goes to the step 2
      When client provide information on step2
      | strCity | strZipCode | strCountry |
      And client clicks on next devices button
      Then client goes to step3
      When  client provide information on step 3
      | strYourComputer | strVersion  | strLenguage | strYourMobileDevice | strModel  | strOperingSystem  |
      And  client clicks on next last step
      When  cliente provide information on last step
      | strPassword | strConfirmPassword  | boolStayInformed  | boolReadTerms | boolAcceptPolicy  |
      And client clicks on complete setup
      Then client created utest user





