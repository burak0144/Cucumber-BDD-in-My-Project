Feature: US1010 Herokuapp buttonlarini test etme


  Scenario: TC16 herokuapp'da add butonuna basma
    Given kullanici "HerokuappUrl" sayfasina gider
    Then  kullanici “Add Element” butona basar

  Scenario: TC17 herokuapp'da delete butonunun gorunurlugunu test etme
    Then  kullanici “Delete” butonu gorunur oluncaya kadar bekleyin
    And  kullanici “Delete” butonunun gorunur oldugunu test edin

  Scenario: TC18 herokuapp'da delete butonuna basma
    And  kullanici Delete butonuna basarak butonu silin

  Scenario: TC19 herokuapp'da delete butonunun gorunmedigini test etme
    And  kullanici Delete butonunun gorunmedigini test edin

    Then sayfayi kapatir







