package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class SearchTest2 {

    @Test
    public void openGoogleComInChromeTest(){

        File file = new File("src/test/resources/drivers/IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
        WebDriver driver = new InternetExplorerDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
         List<WebElement> searchField = driver.findElements(By.cssSelector("input.gNO89b"));
         searchField.get(1).click();
        //List<WebElement> googleLikyButtons = driver.findElements(By.xpath("//*[@class='RNmpXc']"));
       //googleLikyButtons.get(1).click();
       // searchField.click();
     driver.quit();
    }
}
