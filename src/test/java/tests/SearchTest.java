package tests;
import org.testng.annotations.Test;


public class SearchTest extends BaseTest {

    @Test(dataProvider = "dataProvider")
    public void openGoogleComInChromeTest(String text) throws InterruptedException {

        steps.executeSearchByKeyword(text)
                .verifyThatTopResultContainsCorrectText("Selenium")
                .verifyThatTopResultContainsProperAttributeText("LC20lb DKV0Md");
    }
}

