Feature: US1001 Amazon search
#scenario'dan once background ile her scenario'da yapilan yazilir,boylelikle her scenario'dan once calisir

  Background: amazon sayfasina gidin
    Given kullanici amazon sayfasina gider

  Scenario: TC02 Amazon iPhone search Testi
    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder

  Scenario: TC03 Amazon tea pot search Testi
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder

  Scenario: TC04 Amazon flower search Testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    Then sayfayi kapatir

    #Runner class'indan calistirabilmek icin ise su sekilde baslarina tag koyup istedigimizi calistiririz
  @gp1
  Scenario: TC02 Amazon iPhone search Testi
    And iPhone icin arama yapar
    Then sonuclarin iPhone icerdigini test eder
 @gp2
  Scenario: TC03 Amazon tea pot search Testi
    And tea pot icin arama yapar
    Then sonuclarin tea pot icerdigini test eder
 @gp3
  Scenario: TC04 Amazon flower search Testi
    And flower icin arama yapar
    Then sonuclarin flower icerdigini test eder
    Then sayfayi kapatir
