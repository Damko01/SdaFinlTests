Feature: TutorialPoint

  Scenario: Checkbox zakladni zaskrtavani
    Given Uzivatel ne ja stranke tutorialpoint checkbox
    When  Uzivatel zaklikne checkbox s id "c_bs_1"
    Then  Uyivatel vidi zaskrtnuty checkbox s id "c_bs_1"

    Scenario: Zaskrtnuty vsetkych checkboxov
      Given Uzivatel ne ja stranke tutorialpoint checkbox
     When Uzivatel klikne na tlacitko plus pro rozbaleni nabidky s xpath "/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
      And Uzivatel zaklikne checkbox s id "c_bf_1"
      And Uzivatel zaklikne checkbox s id "c_bf_2"
      Then Uyivatel vidi zaskrtnuty checkbox s id "c_bs_1"

  Scenario: Checkbox odskrtnuti checkboxu odskrtne i nadrazeny checkbox
   Given Uzivatel ne ja stranke tutorialpoint checkbox
    When Uzivatel zaklikne checkbox s id "c_bs_1"
    And Uzivatel klikne na tlacitko plus pro rozbaleni nabidky s xpath "/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"
    And Uzivatel zaklikne checkbox s id "c_bf_1"
    Then Uzivatel vidi nezaskrtnuty checkbox s id "c_bs_1"