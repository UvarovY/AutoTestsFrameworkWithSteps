package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import steps.SearchSteps;
import utils.DriverFactory;

import static utils.PropertyReader.getBrowser;
import static utils.PropertyReader.getUrl;

public abstract class BaseTest {

    private static WebDriver driver;
    SearchSteps steps;

    public static WebDriver getDriver() {
        return driver;
    }

    @Parameters({"browser"})
    @BeforeClass
    public WebDriver setUp() {
        driver = DriverFactory.getDriver(getBrowser());
        driver.navigate().to(getUrl());
        steps = new SearchSteps();
        return driver;
    }

    @AfterMethod
    public void goBack() {
        //driver.navigate().goBack();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][]{{"selenium"},/*{"selenium javascript"}*/};
    }

}
