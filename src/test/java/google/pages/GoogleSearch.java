package google.pages;

import google.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch extends BasePage {

    @FindBy(xpath = "//input[@title='Search']")
    private WebElement enterASearch;


    public void searchTopic(String iphone){
        BrowserUtils.waitVisibilityOf(enterASearch);
        enterASearch.click();
        enterASearch.sendKeys(iphone, Keys.ENTER);
    }


}
