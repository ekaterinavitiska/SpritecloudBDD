package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class DocsPage extends BasicPage {
    public By docsHeader = By.id("what-is-calliope");
    public By CookieHeader = By.xpath("//*[contains(@href,'/cookie-policy/')]");

    public DocsPage() {
        waitPageToLoad();
    }

    public void waitPageToLoad() {
        $(docsHeader).waitUntil(Condition.visible, Configuration.timeout);
    }
    public String getDocsHeader() {
        return $(docsHeader).waitUntil(Condition.visible, Configuration.timeout).getText();
    }

    public void clickCookiePolicy() {
        $(CookieHeader).waitUntil(clickable, Configuration.timeout).click();
    }
}
