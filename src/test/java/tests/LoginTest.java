package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.LoginService;
import tests.parent.AbstractTest;

public class LoginTest extends AbstractTest {

    private final LoginService loginService = new LoginService();

    @Test
    public void test() {
        init(loginService);
        loginService.login();
        Assertions.assertEquals("Swag Labs", driver.getTitle());
    }

}
