package page;

import base.GoogleYahooBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends GoogleYahooBase {

    @FindBy (partialLinkText = "Yahoo | M")
    WebElement tracker;
    public SearchPage () {

        PageFactory.initElements(driver, this);
    }

    public void clickYahoo () {
        wdWait.until(ExpectedConditions.elementToBeClickable(tracker));
        tracker.click();
    }

}
