package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchResultsPage extends BasePage {


    @FindBy(xpath = "(//*[@class='LC20lb DKV0Md'])[1]")
    private WebElement resultRowElement;

    public SearchResultsPage() {
        super();
    }

    public void assertThatTopResultContainsCorrectText(String expectedText) {
        resultRowElement.isDisplayed();
        assertThat(resultRowElement.isDisplayed()).as("Element has not been displayed").isTrue();
        assertThat(resultRowElement.getText()).as("Results of serch doesn't contain -selenium").isEqualTo(expectedText);
    }

    public void assertThatTopResultContainsProperAttributeText(String expectedAttributeText) {
        assertThat(resultRowElement.getAttribute("class")).as("Wrong atribyte text").contains(expectedAttributeText);
    }

    /*
     public void assertThatTopResiltContainsProperAttributeText(){
       List<WebElement> resultRows = driver.findElements(By.xpath("(//*[@class='LC20lb DKV0Md'])"));
          for(WebElement resultRow : resultRows ) {
            assertThat(resultRow.getText()).as("Results of serch doesn't contain -selenium").contains("Selenium");
      }
     */
}

