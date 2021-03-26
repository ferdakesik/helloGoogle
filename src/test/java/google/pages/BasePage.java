package google.pages;

import google.utilities.BrowserUtils;
import google.utilities.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(DriverFactory.getDriver(),this);

    }

}
