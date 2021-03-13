package stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import pages.BasicPage;
import pages.NavigaionPage;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageSteps {
    BasicPage basicPage = new BasicPage();
    public final String mainHeader =  "Automated Test Results Dashboard";
    public final String featuresHeader =  "Features";
    public final String pricingHeader =  "Simple and affordable pricing";
    NavigaionPage navigaionPage = new NavigaionPage();

    @Given("User opens basic page")
    public void openBasicPage() {
        Configuration.startMaximized = true;
        Configuration.timeout = 1000;
        open("https://www.calliope.pro/");
        navigaionPage.clickAcceptCookies();
    }

}
