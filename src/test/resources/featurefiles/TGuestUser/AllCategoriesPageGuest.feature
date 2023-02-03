@AllCategoriesPage

Feature: Verify the Categories Screen item

  Scenario Outline: CATEG_TC_0001 Verify the selected category home page is displayed on screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given App should be in logout state.
    When User tap on Categories Screen in Footer
    Then Selected category "<name>" displayed on top left
    Examples:
      | name |
      | Music|

  Scenario Outline: CATEG_TC_0002 Verify the selected category home page is displayed on screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "<name>" displayed on top left
    Examples:
      | name |
      | Kids  |

  Scenario Outline: CATEG_TC_0003 Verify the selected category home page is displayed on screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "<name>" displayed on top left
    Examples:
      | name  |
      | Documentaries |

  Scenario Outline: CATEG_TC_0004 Verify the selected category home page is displayed on screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "<name>" displayed on top left
    Examples:
      | name        |
      | TV Serials  |

  Scenario Outline: CATEG_TC_0005 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "Music" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail |
      | Trending Music|

  Scenario Outline: CATEG_TC_0006 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "TV Serials" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail |
      | Hindi Serials|

  Scenario Outline: CATEG_TC_0007 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "TV Serials" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail |
      | Tamil Serials|

  Scenario Outline: CATEG_TC_0008 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "TV Serials" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail |
      | Telugu Serials|

  Scenario Outline: CATEG_TC_0009 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "Kids" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail    |
      | Fairy Tales |
#      | Pokemon |

  Scenario Outline: CATEG_TC_0010 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "Kids" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail    |
      | Popular Toons |

   Scenario Outline: CATEG_TC_0011 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "Documentaries" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail    |
      | Food |

  Scenario Outline: CATEG_TC_0012 Verify the Rails on Categories.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When User tap on Categories Screen in Footer
    Then Selected category "Documentaries" displayed on top left
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail    |
      | History |