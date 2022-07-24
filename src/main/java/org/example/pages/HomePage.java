package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public HomePage open() {
        driver.get("https://ewavecommerce.lightning.force.com/lightning/page/home");
        By homePageLocator = By.xpath("//span[@title='Recent Records']");
        wait.until(ExpectedConditions.visibilityOfElementLocated(homePageLocator));
        return this;
    }
}
