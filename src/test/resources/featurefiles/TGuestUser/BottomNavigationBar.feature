@BottomNavigationBar

Feature: Bottom Navigation Bar

  Scenario: BN_TC_0001 Verify the bottom navigation tabs displayed on the  home screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Then Home, Shows, Movies, Kids and Others tab should be on the header of screen.

  Scenario: BN_TC_0002 Verify that click on Movie icon on the bottom bar takes user to Movie page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    When Tap on Movie icon on bottom navigation bar.
    Then User should able to navigate to Movie page  of the application.

  Scenario: BN_TC_0003 Verify that click on Shows icon on the bottom bar takes user to Shows page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    When Tap on Shows icon on bottom navigation bar.
    Then User should able to navigate to Shows page  of the application.

  Scenario: BN_TC_0004 Verify that click on Kids icon on the bottom bar takes user to Kids page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Kids page.
    When Tap on Kids icon on bottom navigation bar.
    Then User should able to navigate to Kids page  of the application.

  Scenario: BN_TC_0005 Verify that click on Categories icon on the bottom bar takes user to Categories page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on Categories icon on bottom navigation bar.
    Then User should able to navigate to Catgories page  of the application.