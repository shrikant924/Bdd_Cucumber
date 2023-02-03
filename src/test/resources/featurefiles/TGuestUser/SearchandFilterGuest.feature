@Search
Feature: Search functionality.

  Scenario: Search_TC_0001 (Home Screen)Verify user able to navigate to search screen when user clicks on search icon in Home page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    Then User should navigate to search page.

  Scenario: Search_TC_0002 (Home Screen) Validate that user is able to navigate back  to home  screen when user clicks on back button or device back button  on search page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    And Tap on Back button
    Then User should able to navigate to Home page  of the application.

  Scenario: Search_TC_0003 (Home Screen) Validate that user is able to  search for shows and movies.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    And Tap on Search box.
    And Enter search text "Hero".
    Then Search result should be displayed on screen.

  Scenario: Search_TC_0004 (Home Screen) Validate that No result found is displayed on screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    And Tap on Search box.
    And Enter search text "????".
    Then Search result not found should be displayed on screen.

  Scenario: Search_TC_0005 (Home Screen) Validate that mic icon is changing to cross post tapping on it
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    And Tap on Search box.
    Then Mic icon should change to cross post tapping on it.

  Scenario: Search_TC_0006 (Movie Page)Verify user able to navigate to search screen when user clicks on search icon in Home page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    When Tap on  the search icon
    Then User should navigate to search page.

  Scenario: Search_TC_0007 (Movie Page) Validate that user is able to navigate back  to home  screen when user clicks on back button or device back button  on search page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    When Tap on  the search icon
    And Tap on Back button
    Then User should able to navigate to Home page  of the application.

  Scenario: Search_TC_0008 (Movie Page) Validate that user is able to  search for shows and movies.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    When Tap on  the search icon
    And Tap on Search box.
    And Enter search text "Hero".
    Then Search result should be displayed on screen.

  Scenario: Search_TC_0009 (Movie Page) Validate that mic icon is changing to cross post tapping on it
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Movie page.
    When Tap on  the search icon
    And Tap on Search box.
    Then Mic icon should change to cross post tapping on it.

   Scenario: Search_TC_0010 (Shows Page)Verify user able to navigate to search screen when user clicks on search icon in Home page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    When Tap on  the search icon
    Then User should navigate to search page.

  Scenario: Search_TC_0011 (Shows Page) Validate that user is able to navigate back  to home  screen when user clicks on back button or device back button  on search page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    When Tap on  the search icon
    And Tap on Back button
    Then User should able to navigate to Home page  of the application.

  Scenario: Search_TC_0012 (Shows Page) Validate that user is able to  search for shows and movies.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    When Tap on  the search icon
    And Tap on Search box.
    And Enter search text "Hero".
    Then Search result should be displayed on screen.

  Scenario: Search_TC_0013 (Shows Page) Validate that mic icon is changing to cross post tapping on it
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Shows page.
    When Tap on  the search icon
    And Tap on Search box.
    Then Mic icon should change to cross post tapping on it.

  Scenario: Search_TC_0014 (Kids Page)Verify user able to navigate to search screen when user clicks on search icon in Home page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Kids page.
    When Tap on  the search icon
    Then User should navigate to search page.

  Scenario: Search_TC_0015 (Kids Page) Validate that user is able to navigate back  to home  screen when user clicks on back button or device back button  on search page.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Kids page.
    When Tap on  the search icon
    And Tap on Back button
    Then User should able to navigate to Home page  of the application.

  Scenario: Search_TC_0016 (Kids Page) Validate that user is able to  search for shows and movies.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Kids page.
    When Tap on  the search icon
    And Tap on Search box.
    And Enter search text "Hero".
    Then Search result should be displayed on screen.

  Scenario: Search_TC_0017 (Kids Page) Validate that mic icon is changing to cross post tapping on it
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    Given User is on Kids page.
    When Tap on  the search icon
    And Tap on Search box.
    Then Mic icon should change to cross post tapping on it.

  Scenario: Search_TC_0018 Verify that Browse By Gerne rail is present on default search screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    Then Browse by Genre should present on Search page

  Scenario: Search_TC_0019 Verify that Browse By Language rail is present on default search screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    Then Browse by Language should be present on Search page.

  Scenario: Search_TC_0020 Verify that Browse By Apps rail is present on default search screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    Then Browse by Apps should be present on Search Page

  Scenario: Search_TC_0021 Verify that Trending rail is present on default search screen.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    Then Trending should be present on Search Page

  Scenario Outline: Search_TC_0022 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Horror      |

  Scenario Outline: Search_TC_0023 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Action      |

  Scenario Outline: Search_TC_0024 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Drama       |

  Scenario Outline: Search_TC_0025 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Crime       |

  Scenario Outline: Search_TC_0026 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Comedy      |

  Scenario Outline: Search_TC_0027 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Romance     |

  Scenario Outline: Search_TC_0028 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Thriller    |

  Scenario Outline: Search_TC_0029 Verify tap on any Genre card, open the selected Genre catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "<Genre>" card
    Then Selected "<Genre>" catalog page should be opened
    Examples:
      | Genre       |
      | Sports      |

  Scenario Outline: Search_TC_0030 Verify tap on any Language card, open the selected Language catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on Language "<Language>" card.
    Then Selected Language "<Language>" catalog page should be opened.
    Examples:
      | Language  |
      | Hindi     |

  Scenario Outline: Search_TC_0031 Verify tap on any Language card, open the selected Language catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on Language "<Language>" card.
    Then Selected Language "<Language>" catalog page should be opened.
    Examples:
      | Language  |
      | English   |

  Scenario Outline: Search_TC_0032 Verify tap on any Language card, open the selected Language catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on Language "<Language>" card.
    Then Selected Language "<Language>" catalog page should be opened.
    Examples:
      | Language  |
      | Telugu    |

  Scenario Outline: Search_TC_0033 Verify tap on any Language card, open the selected Language catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on Language "<Language>" card.
    Then Selected Language "<Language>" catalog page should be opened.
    Examples:
      | Language  |
      | Tamil     |

  Scenario Outline: Search_TC_0034 Verify tap on any Language card, open the selected Language catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on Language "<Language>" card.
    Then Selected Language "<Language>" catalog page should be opened.
    Examples:
      | Language  |
      | Marathi   |

  Scenario Outline: Search_TC_0035 Verify tap on any Language card, open the selected Language catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on Language "<Language>" card.
    Then Selected Language "<Language>" catalog page should be opened.
    Examples:
      | Language  |
      | Kannada   |

  Scenario Outline: Search_TC_0036 Verify tap on any Language card, open the selected Language catalog page
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on Language "<Language>" card.
    Then Selected Language "<Language>" catalog page should be opened.
    Examples:
      | Language  |
      | Bangla    |

  Scenario Outline: Search_TC_0037 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Horror" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Hindi     |

  Scenario Outline: Search_TC_0038 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Horror" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | English   |

  Scenario Outline: Search_TC_0039 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Horror" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Telugu    |

  Scenario Outline: Search_TC_0040 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Horror" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Tamil     |

  Scenario Outline: Search_TC_0041 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Action" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Hindi     |

  Scenario Outline: Search_TC_0042 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Action" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | English   |

  Scenario Outline: Search_TC_0043 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Action" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Telugu    |

  Scenario Outline: Search_TC_0044 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Action" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Tamil     |

  Scenario Outline: Search_TC_0045 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Drama" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Hindi     |

  Scenario Outline: Search_TC_0046 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Drama" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | English   |

  Scenario Outline: Search_TC_0047 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Drama" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Telugu    |

  Scenario Outline: Search_TC_0048 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Drama" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Tamil     |

   Scenario Outline: Search_TC_0049 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Crime" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Hindi     |

  Scenario Outline: Search_TC_0050 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Crime" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | English   |

  Scenario Outline: Search_TC_0051 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Crime" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Telugu    |

  Scenario Outline: Search_TC_0052 Verify, tap on Language filter in Genre catalog page, display data according to selected Filter.
    Given User is on home screen
    Then Subscription drawer should be opened on screen.
    When Tap on  the search icon
    When Tap on "Crime" card.
    And  Select Language "<Language>" Filter.
    And   Select movie content
    Then Audio of selected content should same as Language  "<Language>" filter.
    Examples:
      | Language  |
      | Tamil     |