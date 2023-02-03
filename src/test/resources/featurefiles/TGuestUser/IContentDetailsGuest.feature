@ContentDetails

Feature: PI Pages.

  Scenario Outline: PI_TC_0010 Verify user navigate to PI screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And   Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    Then  User is on TV shows PI page
    Examples:
      | Content Name |
      | IceAge      |

  Scenario Outline: PI_TC_0011 Verify the user is able to click on more button.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And   Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    And  Select more button
    Then  Verify Detail Drawer on the PI page
    Examples:
      | Content Name |
      | IceAge      |

  Scenario Outline: PI_TC_0012 Verify MetaData is present or not
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Then  Select movie tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And  Select movie content
    And  Select more button
    Then  Verify MetaData is present or not
    Examples:
      | Content Name |
      | IceAge      |

  Scenario Outline: PI_TC_0013 Verify view all episode on TV show PI screen
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And   Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And Tap on view all episode
    Then  Verify search all episode page is opened
    Examples:
      | Content Name |
      | MTVInsider |

  Scenario Outline: PI_TC_0014 Verify previous episode button on Episode Detail Page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And   Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And   Tap on view all episode
    Then  Verify search all episode page is opened
    And   Tap on Kebab Menu
    And   Tap on Next Button
    And   Tap on Previous Button
    Then  Verify user is able to go to previous episode
    Examples:
      | Content Name |
      | MTVInsider |

  Scenario Outline: PI_TC_0015 Verify next episode button on Episode Detail Page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And   Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And   Tap on view all episode
    Then  Verify search all episode page is opened
    And   Tap on Kebab Menu
    And   Tap on Next Button
    Then  Verify user is able to go to Next episode
    Examples:
      | Content Name |
      | MTVInsider |

  Scenario Outline: PI_TC_0016 Verify close button on Episode Detail Page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And   Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And   Tap on view all episode
    Then  Verify search all episode page is opened
    And   Tap on Kebab Menu
    And   Tap on Close Button
    Then  Verify search all episode page is opened
    Examples:
      | Content Name |
      | MTVInsider |

  Scenario Outline: PI_TC_0017 Verify result not found displayed on Episode search Page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And   Select shows tab from navigation bar
    When Tap on  the search icon
    And Tap on Search box.
    And Enter "<Content Name>" in search box.
    And Select Partner app content
    And   Tap on view all episode
    Then  Verify search all episode page is opened
    And Tap on Search box.
    And Enter search text "????".
    Then Search result not found should be displayed on screen.
    Examples:
      | Content Name |
      | MTVInsider |

  Scenario: PI_TC_0018 Verify  tap on any movies
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Then  Select movie tab from navigation bar
    And   Select see all button
    And   Select movie content
    Then  Verify user is on Movie PI page