import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTutorialPointBdd {
    private WebDriver selenium;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\damia\\z4086\\Work\\SDA\\z4086\\SdaFinalTest\\src\\main\\resources\\chromedriver.exe");
        selenium = new ChromeDriver();
    }

    @After
    public void provedPoUkonceniTestu() {
        selenium.close();
        selenium.quit();
    }

    @Given("Uzivatel ne ja stranke tutorialpoint checkbox")
    public void uzivatelNeJaStrankeTutorialpointCheckbox() {
        selenium.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
    }

    @When("Uzivatel zaklikne checkbox s id {string}")
    public void uzivatelZaklikneCheckboxSId(String idPrvku) {
        selenium.findElement(By.id(idPrvku)).click();
    }

    @When("Uzivatel klikne na tlacitko plus pro rozbaleni nabidky s xpath {string}")
    public void uzivatelKlikneNaTlacitkoPlusProRozbaleniNabidkySXpath(String xpath) {
        selenium.findElement(By.xpath(xpath)).click();}

        @Then("Uyivatel vidi zaskrtnuty checkbox s id {string}")
        public void uyivatelVidiZaskrtnutyCheckboxSId (String idPrvku){
            Assert.assertTrue(selenium.findElement(By.id(idPrvku)).isSelected());
        }
    @Then("Uzivatel vidi nezaskrtnuty checkbox s id {string}")
    public void uzivatelVidiNezaskrtnutyCheckboxSId(String idPrvku) {
        Assert.assertFalse(selenium.findElement(By.id(idPrvku)).isSelected());
    }

}
