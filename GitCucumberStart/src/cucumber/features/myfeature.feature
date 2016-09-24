Feature: Test1

  #Scenario: Testscript1
   # Given Navigate "http://www.google.com"
    #When Click
    #Then Verify
    #And submitvaliddata
    #|Name1|Shri Gajanan|
    #|Name2|Shiv Chindambar|
    #Then QuitDriver
    
  Scenario Outline: Many test runs
    Given Navigate "http://www.google.com"
    When Click
    Then Verify <Link>
    And submitvaliddata
    |Name1|Shri Gajanan|
    |Name2|Shiv Chindambar|
    Then QuitDriver <Title> 
    
    Examples:
    |Link|Title|
    |nameA|A|
    |nameB|B|