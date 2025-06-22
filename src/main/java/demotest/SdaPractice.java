package demotest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SdaPractice {
    private WebDriver selenium;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\damia\\z4086\\Work\\SDA\\z4086\\SdaFinalTest\\src\\main\\resources\\chromedriver.exe");
        selenium = new ChromeDriver();
    }
    @Test
public void testSdaFinalProject() throws Exception {
    selenium.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
    selenium.findElement(By.xpath("//*[@id='bs_1']/span[1]")).click();
    selenium.findElement(By.id("c_bs_1")).click();
    selenium.findElement(By.id("c_bf_2")).click();
    selenium.findElement(By.xpath("//*[@id=\"bs_2\"]/span[1]")).click();
    selenium.findElement(By.id("c_bf_4")).click();
    selenium.findElement(By.id("c_bf_3")).click();
    }
}

