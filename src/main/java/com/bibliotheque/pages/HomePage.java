package com.bibliotheque.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "nav a:nth-child(1)")
    WebElement loginLink;

    public LoginPage getLoginPage() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(css = "nav a:nth-child(2)")
    WebElement registrationLink;

    public RegistrationPage getRegistrationPage() {
        click(registrationLink);
        return new RegistrationPage(driver);
    }

    @FindBy(tagName = "input")
    WebElement searchInput;

    public HomePage enterSearchData(String data) {
        click(searchInput);
        type(searchInput, data);
        return this;
    }

    @FindBy(xpath = "//button[.='Search']")
    WebElement searchButton;

    public SearchResultPage clickOnTheSearchButton() {
        click(searchButton);
        return new SearchResultPage(driver);
    }

    @FindBy(css = "select")
    WebElement selector;

    public HomePage selectSearchCriteria(String searchBy) {
        Select select = new Select(selector);
        select.selectByVisibleText(searchBy);
        return this;
    }

    @FindBy(css = "a:nth-child(2)")
    WebElement logOutLink;

    public HomePage verifyLogOutLinkIsPresent() {
        Assert.assertTrue(shouldHaveText(logOutLink, "Log out", 10));
        return this;
    }

    public HomePage clickOnLogOutLink() {
        click(logOutLink);
        return this;
    }

    @FindBy(css = "nav a:nth-child(1)")
    WebElement userNameLink;

    public UsersProfilePage clickOnUserNameLink() {
        pause(1000);
        click(userNameLink);
        return new UsersProfilePage(driver);
    }

//    ========метод был действителен для входа в личный кабинет с Home Page===========
//    @FindBy(css = "nav a:nth-child(3)")
//    WebElement profileLink;
//
//    public UsersProfilePage getUsersProfilePage() {
//        click(profileLink);
//        return new UsersProfilePage(driver);
//    }


}
