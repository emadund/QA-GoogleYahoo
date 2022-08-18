package page;

import base.GoogleYahooBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class YahooPage extends GoogleYahooBase {
    @FindBy (css = "._yb_t0c9o._yb_1pw9t._yb_1ciyb")
    WebElement image;

    public YahooPage () {
        PageFactory.initElements(driver, this);
    }
    public boolean checkImage () {
        wdWait.until(ExpectedConditions.visibilityOf(image));
        return image.isDisplayed();
    }
}
