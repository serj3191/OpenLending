package com.openLending.pages;

import com.openLending.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GooglePage {

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @FindBy(xpath = "//input[@name='q']")
    private WebElement userInput;

    @FindBy(xpath = "(//h3[.='Open Lending | LinkedIn']/..)[2]")
    private WebElement linkedIn_Page;

    public WebElement getUserInput() {
        wait.until(ExpectedConditions.visibilityOf(userInput));
        return userInput;
    }

    public WebElement getLinkedIn_Page() {
        wait.until(ExpectedConditions.visibilityOf(linkedIn_Page));
        return linkedIn_Page;
    }
}
