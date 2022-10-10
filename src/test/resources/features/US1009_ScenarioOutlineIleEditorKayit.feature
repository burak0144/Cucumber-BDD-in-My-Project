@Editor
Feature: US1009 Scenario Outline ile Editor Kayit Ekleme
Scenario Outline: TC15 kullanici yeni kayit ekleyebilmeli
When kullanici editor adresine gider
Then new butonuna basar
  And firstname olarak "<fisrtname>" yazar
  And lastname olarak "<lastname>" yazar
  And Position olarak "<position>" yazar
  And Office olarak "<office>" yazar
  And Extension olarak "<extension>" yazar
  And Start olarak "<startDate>" yazar
  And Salary olarak "<salary>" yazar
  And Create tusuna basar
  When kullanici "<fisrtname>" ile arama yapar
  Then isim bolumunde "<fisrtname>" oldugunu dogrular

  Examples:
  |fisrtname|lastname|position|office|extension|startDate|salary|
  |berk     |karanfil|QA      |ADANA |QA       |2020-01-01|200  |