Feature: US1007 Scenario Outline ile Amazon search
  Scenario Outline: TC12 amazonda bir listedeki tum elemanlari aratma
    Given kullanici "AmazonUrl" sayfasina gider
    Then "<aranacakKelime>" icin arama yapar
    And sonuclarin "<aranacakKelime>" icerdigini test eder
    Then sayfayi kapatir

    Examples:
    |aranacakKelime|
    |Apple         |
    |Java          |
    |Samsung       |
