Feature: As a potential client i need to search in google to find a web site
@Search
  Scenario Outline: The client searches for some words on google
    Given The client is on google page
    When The client search for word <word>
    Then The client verify that results are shown properly
    Examples:
    |word|
    |Crowdar Academy|
    |Calidad|
    |Software|
    |Testing|