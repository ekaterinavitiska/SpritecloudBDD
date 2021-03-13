package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DocsPage;

public class DocsPageSteps {

    public final String docsHeader =  "What is Calliope?";
    DocsPage docsPage = new DocsPage();


    @Given("Docs page text is correct")
    public void assertDocsTab() {
        Assert.assertEquals(docsPage.getDocsHeader(), docsHeader);
    }

    @Given("Click Cookie Policy")
    public void clickCP() {

            docsPage.clickCookiePolicy();

    }

}
