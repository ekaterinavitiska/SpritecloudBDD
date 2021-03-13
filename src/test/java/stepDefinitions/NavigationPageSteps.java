package stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.FeaturesPage;
import pages.NavigaionPage;
import pages.PricingPage;

import static com.codeborne.selenide.Selenide.open;

public class NavigationPageSteps {
    NavigaionPage navigaionPage = new NavigaionPage();
    public final String mainHeader =  "Automated Test Results Dashboard";
    public final String pricingHeader =  "Simple and affordable pricing";
    PricingPage pricingPage;

    @Given("User presses Features tab")
    public void pressFeatureTab() {
        Assert.assertEquals(navigaionPage.getHeaderText(), mainHeader);
        FeaturesPage featuresPage = navigaionPage.openFeaturesPage();
    }

    @Given("User presses Prices tab")
    public void pressPricesTab() {
        pricingPage = navigaionPage.openPricingPage();
    }

    @Given("Prices tab header is correct")
    public void assertPricesTab() {
        Assert.assertEquals(pricingPage.getPricingHeader(), pricingHeader);
    }
}
