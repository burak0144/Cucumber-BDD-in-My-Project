@AutoExercisePage
Feature: US1005 Negative Login Testi

  Background: AutoExercise sayfasina gidin
    Given kullanici "AutoUrl" ana sayfasinda
    Then Log in yazisina tiklar

  Scenario: TC09 yanlis username, dogru sifre ile giris yapilamaz


    And gecersiz username "AutoWrongUsername" girer
    And gecerli password "AutoPassword" girer
    And Login butonuna basar
    Then sayfaya giris yapilmadigini kontrol eder


  Scenario: TC10 dogru username, yanlis sifre ile giris yapilamaz


    And gecerli username "AutoUsername" girer
    And gecersiz password "AutoWrongPassword" girer
    And Login butonuna basar
    Then sayfaya giris yapilmadigini kontrol eder

  Scenario: TC11 yanlis username, yanlis sifre ile giris yapilamaz

    
    And gecersiz username "AutoWrongUsername" girer
    And gecersiz password "AutoWrongPassword" girer
    And Login butonuna basar
    Then sayfaya giris yapilmadigini kontrol eder
    And kulllanici sayfayi kapatir