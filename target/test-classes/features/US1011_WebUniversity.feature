Feature: US1011 WebUniversity username ve passwrord girme
  Scenario:    TC20 WebUniversity username ve password girme

Given Kullanici "WebUniversityUrl" adresine gidin
And Kullanici Login Portal a kadar asagi iner
Then Kullanici Login Portal a tiklar
Then Kullanici Diger window'a gecin
And Kullanici "username" ve "password" kutularina deger yazdirin
And Kullanici login butonuna basar
Then Kullanici Popup'ta cikan yazinin "validation failed" oldugunu test edin
And Kullanici Ok diyerek Popup'i kapatin
And Kullanici Ilk sayfaya geri donun
Then Kullanici Ilk sayfaya donuldugunu test edin
    Then sayfayi kapatir


