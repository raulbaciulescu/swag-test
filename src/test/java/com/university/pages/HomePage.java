package com.university.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class HomePage extends PageObject {

    @FindBy(name="user-name")
    private WebElementFacade userNameTextInput;

    @FindBy(name="password")
    private WebElementFacade passwordTextInput;

    @FindBy(name="login-button")
    private WebElementFacade loginButton;

    public void enterUsername(String keyword) {
        userNameTextInput.type(keyword);
    }

    public void enterPassword(String keyword) {
        passwordTextInput.type(keyword);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessage() {
        WebElementFacade errorContainer = find(By.className("error-message-container"));
        return errorContainer.findElements(By.tagName("h3")).get(0).getText();
    }
}