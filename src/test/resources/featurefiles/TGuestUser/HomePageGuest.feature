@Home
Feature: Home Page

  Scenario: Home_TC_0001 Verify that tap on Hamburger icon on open the side menu on screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on Hamburger icon.
    Then Side menu should be open on screen

  Scenario: Home_TC_0002 Verify the header items displayed on the  home screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Then Hamburger icon and Search icon, and Logo is displayed on the header of screen

  Scenario: Home_TC_0003 Verify that click on the See All button above the available rails opens the catalog page of that rail,
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on See All button of 1 rail.
    Then User should navigate to catalog page of that rail.

  Scenario Outline: Home_TC_0004 Verify the Rails on Home Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | New On Binge  |

  Scenario Outline: Home_TC_0005 Verify the Rails on Home Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Trending On TV |

  Scenario Outline: Home_TC_0006 Verify the Rails on Home Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Browse By Language  |

  Scenario Outline: Home_TC_0007 Verify the Rails on Home Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Browse By Genre |

  Scenario Outline: Home_TC_0008 Verify the Rails on Movie Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | New Movies  |

  Scenario Outline: Home_TC_0009 Verify the Rails on Movie Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Hollywood Action Movies |

  Scenario Outline: Home_TC_0010 Verify the Rails on Movie Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Bollywood Movies  |

  Scenario Outline: Home_TC_0011 Verify the Rails on Movie Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Browse By Language  |

  Scenario Outline: Home_TC_0012 Verify the Rails on Movie Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Browse By Genre |

  Scenario Outline: Home_TC_0013 Verify the Rails on Shows Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | TV Serials |

  Scenario Outline: Home_TC_0014 Verify the Rails on Shows Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Browse By Language  |

  Scenario Outline: Home_TC_0015 Verify the Rails on Shows Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Browse By Genre |

  Scenario Outline: Home_TC_0016 Verify the Rails on Shows Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Edgy Shows |

  Scenario Outline: Home_TC_0017 Verify the Rails on Shows Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | International Shows |

  Scenario Outline: Home_TC_0018 Verify the Rails on Shows Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Trending on TV |

  Scenario Outline: Home_TC_0019 Verify the Rails on Shows Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Top Rated Shows |

#  Scenario Outline: Home_TC_0012 Verify the Rails on Kids Page.
#    Given User is on home screen
#    Then Subscription drawer should be opened on screen.
##    Given App should be in logout state.
#    Given User is on Kids page.
#    And Scroll to Bottom
#    Then Verify "<rail>" rails are displayed correctly on App
#    Examples:
#      | rail|
#      | Popular Toons |
#      | Chhota Bheem Moviethon |
#      | Fairy Tales  |

    Scenario Outline: Home_TC_0020 Verify the Rails on Sports Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Sports page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | India Cricket Highlights |

  Scenario Outline: Home_TC_0021 Verify the Rails on Sports Page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Sports page.
    And Scroll to Bottom
    Then Verify "<rail>" rails are displayed correctly on App
    Examples:
      | rail|
      | Popular in Sports |