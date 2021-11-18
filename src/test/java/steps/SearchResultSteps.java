package steps;

import pages.SearchResultsPage;

public class SearchResultSteps {

    private SearchResultsPage searchResultsPage = new SearchResultsPage();

    public SearchResultSteps verifyThatTopResultContainsCorrectText(String expectedText) {

        searchResultsPage.assertThatTopResultContainsCorrectText(expectedText);
        return this;
    }

    public SearchResultSteps verifyThatTopResultContainsProperAttributeText(String expectedAttributeText) {

        searchResultsPage.assertThatTopResultContainsProperAttributeText(expectedAttributeText);
        return this;
    }
}
