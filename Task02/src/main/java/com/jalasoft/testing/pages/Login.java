package com.jalasoft.testing.pages;

/**
 * Created by Igor Santa Cruz on 5/18/2016.
 */
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login extends AbstractBasePage {

    public static final String URL_SALESFORCE = "https://login.salesforce.com/";

    @FindBy(id = "username")
    private WebElement userNameTextField;

    @FindBy(id = "password")
    private WebElement passwordTextField;

    @FindBy(id = "Login")
    private WebElement loginButton;

    public Login() {
        driver.get(URL_SALESFORCE);
    }

    public void setUserNameTextField(String username) {
        wait.until(ExpectedConditions.visibilityOf(userNameTextField));
        FormFunctions.fillTextBox(userNameTextField,username);
    }

    public void setPasswordTextField(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordTextField));
        FormFunctions.fillTextBox(passwordTextField,password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }

    public MainContainer clickLoginButtonToMainContainer() {
        clickLoginButton();
        return new MainContainer();
    }

    public MainContainer loginAs(String userName, String password) {
        setUserNameTextField(userName);
        setPasswordTextField(password);
        return clickLoginButtonToMainContainer();
    }

}
