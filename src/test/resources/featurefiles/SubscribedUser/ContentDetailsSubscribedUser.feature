@ContentDetails

Feature: PI Pages.

   Scenario Outline: PI_TC_0005 Verify the functionality of "Play" button when partner app is not installed
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    Given Parental control set to No Restriction
    And Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Partner app installation Popup open
    Examples:
      | Content Name |
      | IceAge   |

  Scenario Outline: PI_TC_0006 Verify the functionallity of "play  button" on PI screen for" Registred / subscribed user" for Movies which are  part of  premium package
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    Given Parental control set to No Restriction
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    Then  Tap on Play button
    Then  Verify user is able to play the movie
    Examples:
      | Content Name |
      | Current  |

  Scenario Outline: PI_TC_0007 Verify the functionallity of "Resume  button" on PI screen for" Registred / subscribed user" for Movies which are  part of  premium package
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    Given Parental control set to No Restriction
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    Then  Tap on Resume button
    Then  Verify user is able to play the movie
    Examples:
      | Content Name |
      | Current   |

  Scenario Outline: PI_TC_0008 Verify user is able to Pause the movie
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    Given Parental control set to No Restriction
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    Then  Tap on Resume button
    Then  Verify user is able to play the movie
    And Tap on Pause button
    Then Verify user is able to paused the movie
    Examples:
      | Content Name |
      | Current   |

  Scenario Outline: PI_TC_0009 Verify Movie Pi page items
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    Then  Verify the movie PI page items
    Examples:
      | Content Name |
      | IceAge      |