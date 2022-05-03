Feature: Test Login Functonality

  Scenario Outline: Check Login is scuccessfull with valid credintials
    Given Browser is open
    And User is on  login page
    When User enters <username> and <password>
    And user click on login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | vijay    |    12345 |
      | ramu     |    12345 |
