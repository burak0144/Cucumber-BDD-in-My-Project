Feature: US1001 Amazon search

  Background: amazon sayfasina gidin
    Given kullanici amazon sayfasina gider
    #4.satirda key gonderip .properties'ten valuesunu donderdi

    #parametreli kullanmak istedigimiz kelimeyi " " arasina alip stepDefinitions classindan method olusturup
    #burada " " icerisini degistirip tekrar tekrar kullaniriz
  Scenario: TC05 Amazon iPhone search Testi
    And "iPhone" icin arama yapar
    Then sonuclarin "iPhone" icerdigini test eder

  Scenario: TC06 Amazon tea pot search Testi
    And "tea pot" icin arama yapar
    Then sonuclarin "tea pot" icerdigini test eder

  Scenario: TC07 Amazon flower search Testi
    And "flower" icin arama yapar
    Then sonuclarin "flower" icerdigini test eder
    Then sayfayi kapatir

    Scenario: TC08 Amazon Asus search Testi
      And "Asus" icin arama yapar
      Then sonuclarin "Asus" icerdigini test eder
      Then sayfayi kapatir
