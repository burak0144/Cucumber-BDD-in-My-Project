Feature: US1008 Scenario Outline ile Negative Login Testi
  Scenario Outline: TC14 farkli kullanici adi ve password
    Given kullanici "AutoUrl" ana sayfasinda
    Then Log in yazisina tiklar
    And  scanario outline'dan username "<username>" girer
    And  scanario outline'dan password "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilmadigini kontrol eder
    And kulllanici sayfayi kapatir


    Examples:
    |username|password|
    |karanfilkaranfil822@gmail.com|karanfil82|
    |karanfil822@gmail.com        |karanfil822|
    |karanfil822@gmail.com |karanfil82        |
    #1.scenario dogru username,yanlis sifre
    #2.scenario yanlis username,dogru sifre
    #3.scenario yanlis username,yanlis sifre