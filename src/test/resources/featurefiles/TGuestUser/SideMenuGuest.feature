@SideMenu
Feature: Side Menu.

  Scenario: SM_TC_0052 Verify side menu items without login.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    When Click on the Hamburger menu on the top left side of the screen .
    Then Profile picture icon, Login button, Subscribe, Binge List,Notification,Settings, Help & Support,Terms & Conditions, Privacy policy and Version Number.

  Scenario: SM_TC_0053 Verify that login screen is opened when tap on Binge List in Side Menu Login drawer is opened.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Then Login screen should be opened.

  Scenario: SM_TC_0054 Verify the setting page of the side menu Login drawer is opened.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    Then Login screen should be opened.

  Scenario: SM_TC_0055 Verify the tap Notification of the side menu Login drawer is opened.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Notifications tab on the side menu.
    Then Login screen should be opened.

  Scenario: SM_TC_0056 Verify that tap on Terms and Condition in Side menu, navigate user to Terms and Condition screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Terms and Condition tab on the side menu.
    Then User should navigate to Terms and Condition screen.

  Scenario: SM_TC_0057 Verify that tap on Privacy Policy in Side menu, navigate user to Privacy Policy screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Privacy Policy tab on the side menu.
    Then User should navigate to Privacy Policy screen.