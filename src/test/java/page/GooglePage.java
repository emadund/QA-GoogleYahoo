package page;

import base.GoogleYahooBase;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GooglePage extends GoogleYahooBase {

    @FindBy(css = ".gLFyf.gsfi")
    WebElement inputGoogle;



    public GooglePage() {
        PageFactory.initElements(driver, this);
    }

    public void method2() {
        wdWait.until(ExpectedConditions.elementToBeClickable(inputGoogle));
        inputGoogle.clear();
        inputGoogle.sendKeys("yahoo");
        inputGoogle.sendKeys(Keys.ENTER);
    }


}
