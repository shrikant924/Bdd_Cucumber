@HelpandSupport

Feature: Help and Support

  Scenario: HS_TC_0001 Verify that tap on Help and Support in Side menu, navigate user to Help and Support screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Help and Support tab on the side menu.
    Then User should navigate to Help and Support screen.

  Scenario: HS_TC_0002 Verify that tap on Help and Support back button user navigate to home screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Help and Support tab on the side menu.
    Then User should navigate to Help and Support screen.
    And  Tap on Settings Back Button
    Then User should able to navigate to Home page  of the application.