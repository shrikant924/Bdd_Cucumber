@SideMenu
Feature: Side Menu.

  Scenario: SM_TC_0027 Verify the side menu for the Non DTH user with no subscription.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    Then Profile picture icon, Mobile Number, Go VIP, Binge List,Notification,Settings, Help & Support,Terms & Conditions, Privacy policy and Version Number.

###-----------------------Set Parental Pin------------------------------------------
  Scenario Outline: SM_TC_0028 To verify that User is able to Set the Parental Pin first time login
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
   Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Set Viewing Restrictions first time <Number>
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      | U/A 7+        |     1   |

  Scenario Outline: SM_TC_0029 To verify user is able to set the parental control restrictions
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      | U             |     0   |

  Scenario Outline: SM_TC_0030 To verify user is able to set the parental control restrictions
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      | U/A 7+        |     1   |

  Scenario Outline: SM_TC_0031 To verify user is able to set the parental control restrictions
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      | U/A 13+       |     2   |

  Scenario Outline: SM_TC_0032 To verify user is able to set the parental control restrictions
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      | U/A 16+       |     3   |

  Scenario Outline: SM_TC_0033 To verify user is able to set the parental control restrictions
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      | A             |     4   |

  Scenario Outline: SM_TC_0034 To verify user is able to set the parental control restrictions
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      |No Restriction |     5   |

  Scenario Outline: SM_TC_0035 To verify if Pin is requested to play any content after setting Parental restriction
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  | Content Name |
      |     0   | Regards  |

  Scenario Outline: SM_TC_0036 To verify if Pin is requested to play any content after setting Parental restriction
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  | Content Name |
      |     1   | Regards  |

  Scenario Outline: SM_TC_0037 To verify if Pin is requested to play any content after setting Parental restriction
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  | Content Name |
      |     2   | Regards  |

  Scenario Outline: SM_TC_0038 To verify if Pin is requested to play any content after setting Parental restriction
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  | Content Name |
      |     3   | Regards  |

  Scenario Outline: SM_TC_0039 To verify if Pin is requested to play any content after setting Parental restriction
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  | Content Name |
      |     4   | Regards  |

  Scenario Outline: SM_TC_0040 To verify user is able to play the movie after entering the Parental Pin
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Parental Pin PopUP is displayed
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    Then  Verify user is able to play the movie
    Examples:
      | Content Name |
#      | Go Goa Gone  |
      | Regards  |

  Scenario Outline: SM_TC_0041 To verify if parental pin is requested when  user Initiate Modify Subscription Journey
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    And Tap on Hamburger icon.
    And Click on My Plan, Subscribe tab on the side menu.
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  |
      |     0   |

  Scenario Outline: SM_TC_0042 To verify if parental pin is requested when  user Initiate Modify Subscription Journey
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    And Tap on Hamburger icon.
    And Click on My Plan, Subscribe tab on the side menu.
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  |
      |     1   |

  Scenario Outline: SM_TC_0043 To verify if parental pin is requested when  user Initiate Modify Subscription Journey
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    And Tap on Hamburger icon.
    And Click on My Plan, Subscribe tab on the side menu.
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  |
      |     2   |

  Scenario Outline: SM_TC_0044 To verify if parental pin is requested when  user Initiate Modify Subscription Journey
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    And Tap on Hamburger icon.
    And Click on My Plan, Subscribe tab on the side menu.
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  |
      |     3   |

  Scenario Outline: SM_TC_0045 To verify if parental pin is requested when  user Initiate Modify Subscription Journey
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    And Tap on Hamburger icon.
    And Click on My Plan, Subscribe tab on the side menu.
    Then Verify Parental Pin PopUP is displayed
    Examples:
      | Number  |
      |     4   |

#-----------------------------------------Change Parental Pin---------------------------------------
  Scenario Outline: SM_TC_0046 To verify that User is able to Set the Parental Pin first time login
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Set Viewing Restrictions first time <Number>
    Then Verify Parental Pin setup successfully "<name>"
    Examples:
      | name          | Number  |
      | U/A 7+        |     1   |

  Scenario: SM_TC_0047 To verify that User is able to change the Parental Pin
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Parental Pin to change the pin
    And Enter OTP in OTP text boxes.
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    Then Verify Parental Pin Changed Successfully

  Scenario: SM_TC_0048 To verify that User is able to change the Parental Pin using Forget Pin
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Tap on Forget PIN
    And Enter OTP in OTP text boxes.
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    Then Verify Parental Pin Changed Successfully

  Scenario: SM_TC_0049 To verify that User incorrect Parental Pin message is displayed
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin
    And Tap on Parental Control Pin proceed button
    Then Verify Incorrect Parental Pin message is displayed

  Scenario: SM_TC_0050 Verify the functionality of Not now button on Parental PIN Dialog
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Tap on Not Now Parental PIN dialog box
    Then Verify Enter Pin dialog box get cancelled

  Scenario Outline: SM_TC_0051 To verify PIN is not requested when No restrictions is set
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    And Click on Parental Control tab on the setting menu.
    And Tap on Viewing Restrictions
    And Enter Parental Pin 1
    And Tap on Parental Control Pin proceed button
    And Set Viewing Restrictions <Number>
    And Tap on Set button
    And Go to home screen
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on Play button
    Then Verify Parental Pin PopUP is not displayed
    Examples:
      | Number  | Content Name |
#      |   5     | Go Goa Gone  |
      |   5     | Regards  |