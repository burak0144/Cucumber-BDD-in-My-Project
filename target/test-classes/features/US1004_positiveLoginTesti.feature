Feature: US1004 Positive Login Testi

  Scenario: TC08 Positive Login Testi
    Given kullanici "AutoUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And gecerli username "AutoUsername" girer
    And gecerli password "AutoPassword" girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kulllanici sayfayi kapatir
