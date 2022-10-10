package com.talentlm.UI.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPage extends BasePages{

      @FindBy(xpath = "//input[@name='name']")
       private WebElement firstNameInput;

        @FindBy(xpath = "//input[@name='surname']")
        private WebElement lastNameInput;

        @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInput;
    @FindBy(xpath = "//input[@name='username']")
    private WebElement userNameInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;



    public AddNewUserPage inputFirstName(String firstName) {
        helper.sendKeys(firstNameInput, firstName);
        return this;
    }
    public AddNewUserPage inputLastName(String lastName) {
        helper.sendKeys(lastNameInput, lastName);
        return this;
    }

    public AddNewUserPage inputEmailAddres(String email) {
        helper.sendKeys(emailInput, email);
        return this;
    }
    public AddNewUserPage inputUserName(String userName) {
        helper.sendKeys(userNameInput, userName);
        return this;
    }
}
