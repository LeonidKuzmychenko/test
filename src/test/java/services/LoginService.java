package services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginService {

    @FindBy(id = "login-button")
    private WebElement loginButton;

    @FindBy(xpath = ".//div[@id='login_button_container']//form//input[1]")
    private WebElement loginInput;

    @FindBy(xpath = ".//div[@id='login_button_container']//form//div[@class='form_group'][2]//input[1]")
    private WebElement passwordInput;

    public void login() {
        loginInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginButton.click();
    }

}
