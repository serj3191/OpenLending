package com.openLending.pages;

import com.openLending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkedInPage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    public LinkedInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath = "//h4[@class='top-card-layout__second-subline']")
    private WebElement text;

    public WebElement getText() {
        wait.until(ExpectedConditions.visibilityOf(text));
        return text;
    }
}
