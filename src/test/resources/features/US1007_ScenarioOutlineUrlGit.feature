@FarkliUrl
Feature: US1007 Scenario Outline ile Farkli sitelere gitme
  Scenario Outline: TC13 Farkli sitelere gitme
    Given kullanici "<gidilecekUrl>" adresine gider
    And "<gidilecekUrl>" sayfasina gidildigini test et
    Then sayfayi kapatir

    Examples:
    |gidilecekUrl|
    |AmazonUrl   |
    |TechproedUrl|
    |BestbuyUrl  |
