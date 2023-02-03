@Subscription
Feature: Subscriptions.

  Scenario: Sub_TC_0001 Verify user navigate to home screen when tap on Do it later on subscription mini drawer
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    Then User should able to navigate to Home page  of the application.

  Scenario: Sub_TC_0002 Verify Subscription page open when user tap on header-Subscribe
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    And Tap on Header Subscribe
    Then Verify subscription page is opened

  Scenario: Sub_TC_0003 Verify Login page open when user tap on Exisiting User Login on header-Subscribe
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    And Tap on Header Subscribe
    And Tap on existing user login
    Then Login screen should be opened.

  Scenario: Sub_TC_0004 Verify Subscription page open when user tap on subscription from side menu
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on My Plan, Subscribe tab on the side menu.
    Then Verify subscription page is opened