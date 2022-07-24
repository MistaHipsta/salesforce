package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public LoginPage open() {
        driver.get("https://ewavecommerce.my.salesforce.com/");
        return this;
    }

    public LoginPage inputTextInUserName(String userName) {
        userNameInput.sendKeys(userName);
        return this;
    }

    public LoginPage inputTextInPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    public LoginPage submitForm() {
        loginButton.submit();
        return this;
    }
}