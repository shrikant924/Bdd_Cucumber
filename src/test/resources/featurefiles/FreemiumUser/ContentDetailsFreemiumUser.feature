@ContentDetails

Feature: PI Pages.

### -------------------Freemium User Test cases---------------------------------

  Scenario Outline: PI_TC_0001 Verify the trailer button is present when auto trailer is OFF
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    Given AutoPlay Trailers should be OFF
    And Tap on Settings Back Button
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    Then  Verify Trailer button is present
    Examples:
      | Content Name |
#      | Judwa   |
      | SP Chauchan   |

  Scenario Outline: PI_TC_0002 Verify the trailer button is not present when auto trailer is ON
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    When Click on the Hamburger menu on the top left side of the screen .
    And Click on settings tab on the side menu .
    Given AutoPlay Trailers should be ON
    And Tap on Settings Back Button
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    Then  Verify Trailer button is not present
    Examples:
      | Content Name |
#      | Judwa  |
      | SP Chauchan   |

  Scenario Outline: PI_TC_0003 Verify the functionallty of "add to binge  list" icon on TV show PI Screen
    Given User is on home screen
    Then Select Content Language should be opened on screen.
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    And   Tap on Add to Binge List
    Then   Verify content added to binge list
    Examples:
      | Content Name |
      | Dhaakad      |

  Scenario Outline: PI_TC_0004 Verify the functionallty to remove from binge list
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logged-in state
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    And   Tap on Binge List to remove
    Then  Verify content removed from binge list
    Examples:
      | Content Name |
      | Dhaakad      |