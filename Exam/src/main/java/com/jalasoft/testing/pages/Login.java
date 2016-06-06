package com.jalasoft.testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Igor Santa Cruz on 5/26/2016.
 */
public class Login extends AbstractBasePage {

    private static final String URL_TODOIST = "https://todoist.com/Users/showLogin";

    @FindBy(id = "email")
    private WebElement emailTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(css = ".submit > a")
    private WebElement loginButton;

    public Login() {
        driver.get(URL_TODOIST);
    }

    public void setEmailTextField(String username) {
        wait.until(ExpectedConditions.visibilityOf(emailTextField));
        FormFunctions.fillTextBox(emailTextField, username);
    }

    public void setPasswordTextField(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        FormFunctions.fillTextBox(passwordTextField, password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public MainContainer clickLoginButtonToMainContainer() {
        clickLoginButton();
        return new MainContainer();
    }

    public MainContainer loginAs(String email, String password) {
        setEmailTextField(email);
        setPasswordTextField(password);
        return clickLoginButtonToMainContainer();
    }

}
