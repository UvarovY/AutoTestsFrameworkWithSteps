package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class DriverFactory {

    private static WebDriver driver;

    private static final String DRIVER_PATH = "src/test/resources/drivers/";


    public static WebDriver getDriver(Browser browser) {
          File file;
        switch (browser) {
            case CHROME:
                file = new File(DRIVER_PATH + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                System.out.println("Test in Chrome browser is opened ");
                break;
            case IE:
                file = new File(DRIVER_PATH + "IEDriverServer.exe");
                System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
                driver = new InternetExplorerDriver();
                System.out.println("Test in InternetExplorer browser is opened");
                break;
            default:
                file = new File(DRIVER_PATH + "chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                System.out.println("Test in Chrome browser is opened by default ");
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }
}
