@SideMenu
Feature: Side Menu.

  Scenario: SM_TC_0001 Verify that notification toggle button ON
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    Given Notification Settings should be Off
    And Click on Notification Settings toggle button on the setting menu
    Then Verify user is able to change to notification toggle button Off to ON

  Scenario: SM_TC_0002 Verify that notification toggle button OFF
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    Given Notification Settings should be ON
    And Click on Notification Settings toggle button on the setting menu
    Then Verify user is able to change to notification toggle button ON to OFF

  Scenario: SM_TC_0003 Verify the setting page of the side menu.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    Then Settings title, Back button,Expandable Edit Profile,Expandable Parental PIN,Expandable Transaction History,Expandable Content Language,Expandable Device Management,Notification setting tab with on off switch,Autoplay trailers with on off switch, Account Refresh and Log Out button.

  Scenario: SM_TC_0004 Verify that tap on Binge List in Side menu, navigate user to Binge List screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Then User should navigate to Binge List screen.

  Scenario: SM_TC_0005 Verify that tap on Setting in Side menu, navigate user to Settings screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    Then User should navigate to Settings screen.

  Scenario: SM_TC_0006 Verify that tap on Edit Profile in Setting menu, navigate user to Edit Profile screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Edit Profile tab on the setting menu.
    Then User should navigate to Edit Profile screen.

  Scenario: SM_TC_0007 Verify that tap on Content Language in Setting menu, navigate user to Content Language screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Content Language tab on the setting menu.
    Then User should navigate to Content Language screen.

  Scenario: SM_TC_0008 Verify that tap on Parental Control in Setting menu, navigate user to Parental Control screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    Then User should navigate to Parental Control screen.

  Scenario: SM_TC_0009 Verify that tap on Manage Devices in Setting menu, navigate user to Manage Devices screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Manage Devices tab on the setting menu.
    Then User should navigate to Manage Devices screen.

  Scenario: SM_TC_0010 Verify that tap on Notifications in Side menu, navigate user to Notifications screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Notifications tab on the side menu.
    Then User should navigate to Notifications screen.

  Scenario: SM_TC_0011 Verify that tap on Transaction History in Side menu, navigate user to Transaction History screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Transaction History tab on the side menu.
    Then User should navigate to Transaction History screen.

  Scenario: SM_TC_0012 Verify that tap on Terms and Condition in Side menu, navigate user to Terms and Condition screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Terms and Condition tab on the side menu.
    Then User should navigate to Terms and Condition screen.

  Scenario: SM_TC_0013 Verify that tap on Privacy Policy in Side menu, navigate user to Privacy Policy screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Privacy Policy tab on the side menu.
    Then User should navigate to Privacy Policy screen.

  Scenario: SM_TC_0014 Verify that tap on Logout in Setting menu and tap on not now button in Logout Pop Up
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Tap on Logout button.
    And Tap on Not Now button
    Then User should navigate to Settings screen.

  Scenario: SM_TC_0015 Verify that tap on Cancel button in Edit Profile screen and it close the Edit Profile Screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Edit Profile tab on the setting menu.
    And Tap on Cancel Button.
    Then User should navigate to Settings screen.

  Scenario: SM_T_0016 Verify that select the content language on Content Language Screen in Setting menu
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Content Language tab on the setting menu.
    And Select Content Language
    And Click on Content Language tab on the setting menu.
    Then Verify content language is added in the Content Language Screen app.

  Scenario: SM_TC_0017 Verify that remove the content language on Content Language Screen in Setting menu
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Content Language tab on the setting menu.
    And Select Content Language Remove
    And Click on Content Language tab on the setting menu.
    Then  Verify content language is unselected in the Content Language Screen app.

  Scenario: SM_TC_0018 Verify by default Add Binge List icon, Binge List empty message and description should be displayed on Binge List page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Given Binge list should be Empty
    Then Binge List icon, Empty message , and description should be on Binge List screen.

  Scenario: SM_TC_0019 Verify, click on Discover to Add button takes user to Home Page of Application
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Given Binge list should be Empty
    And Tap on Discover To Add button in Binge List Screen on App.
    Then User is on home screen

  Scenario: SM_TC_0020 Verify, movie content added from PI should be displayed in Binge List.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Given Binge list should be Empty
    And  Tap on Settings Back Button
    When  Select movie tab from navigation bar
    And   Select see all button
    And   Select movie content
    And   Tap on Add to Binge List
    And Select shows tab from navigation bar
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Then Verify video added to binge List in Binge List Screen on app

  Scenario: SM_TC_0021 Verify, click on select button in Binge List, changed the movies cards to selection mode .
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Given Binge list should be Empty
    And  Tap on Settings Back Button
    When  Select movie tab from navigation bar
    And   Select see all button
    And   Select movie content
    And   Tap on Add to Binge List
    And Select shows tab from navigation bar
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    And Click on Select button.
    Then Should changed the content card to selection mode

  Scenario: SM_TC_0022 Verify,click on any content card in selection mode select the content from Remove.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Given Binge list should be Empty
    And  Tap on Settings Back Button
    When  Select movie tab from navigation bar
    And   Select see all button
    And   Select movie content
    And   Tap on Add to Binge List
    And Select shows tab from navigation bar
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    And Click on Select button.
    And Click on any content card.
    Then Clicked card should be selected from Remove

  Scenario: SM_TC_0023 Verify,count of selected content in Binge List  is equal number display in Remove button
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Given Binge list should be Empty
    And  Tap on Settings Back Button
    When  Select movie tab from navigation bar
    And   Select see all button
    And   Select movie content
    And   Tap on Add to Binge List
    And Select shows tab from navigation bar
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    And Click on Select button.
    And Click on any content card.
    Then Select Content count should be matched with the number display on Remove button

  Scenario: SM_TC_0024 Verify that Remove the content from the app Binge List
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    Given Binge list should be Empty
    And  Tap on Settings Back Button
    When  Select movie tab from navigation bar
    And   Select see all button
    And   Select movie content
    And   Tap on Add to Binge List
    And Select shows tab from navigation bar
    And Click on the Hamburger menu on the top left side of the screen .
    And Click on Binge List tab on the side menu.
    And Remove content from binge list
    Then Verify video is removed to binge List in Binge List Screen on app

  Scenario: SM_TC_0025 Verify that tap on Help and Support in Side menu, navigate user to Help and Support screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Help and Support tab on the side menu.
    Then User should navigate to Help and Support screen.

  Scenario: SM_TC_0026 Verify that tap on Help and Support in Side menu, navigate user to Help and Support screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on Help and Support tab on the side menu.
    Then User should navigate to Help and Support screen.
    And  Tap on Settings Back Button
    Then User should able to navigate to Home page  of the application.