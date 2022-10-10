Feature: US1001 Amazon search

  Scenario: TC01 Amazon search Testi

    Given kullanici amazon sayfasina gider
    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder
    Given kullanici amazon sayfasina gider
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
    Given kullanici amazon sayfasina gider
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    Then sayfayi kapatir
