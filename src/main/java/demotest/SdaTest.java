package demotest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdaTest {

    private WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\damia\\z4086\\Work\\SDA\\z4086\\SdaFinalTest\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void sdaTest(){
        //Toto mi pojde na stranku tutorialpoint
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        //Toto mi zvetsi obrazovku
        driver.manage().window().setSize(new Dimension(1936, 1048));
        //Toto mi najde na stranke prvok a vzpise meno
        driver.findElement(By.id("name")).sendKeys("Jenda");
        //Toto mi najde na stranke prvok a vzpise email
        driver.findElement(By.id("email")).sendKeys("email@email.cz");


    }



}
