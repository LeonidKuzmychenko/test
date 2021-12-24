package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.BucketService;
import services.LoginService;
import tests.parent.AbstractTest;

//T1
public class AddFirstProductToBucketTest extends AbstractTest {

    private final LoginService loginService = new LoginService();
    private final BucketService bucketService = new BucketService();

    @Test
    public void test() {
        init(loginService, bucketService);
        loginService.login();
        bucketService.buyFirstProduct();
        Assertions.assertEquals(1, bucketService.getBadgeCount(), "Иконка количества товаров в корзине равна 1");
    }

}
