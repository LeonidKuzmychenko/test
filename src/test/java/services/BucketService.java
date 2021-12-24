package services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BucketService {

    @FindBy(className = "inventory_item")
    private List<WebElement> productList;

    @FindBy(className = "shopping_cart_badge")
    private WebElement bucketBadge;

    public void buyFirstProduct(){
        WebElement firstProduct = productList.get(0);
        WebElement firstProductButton = firstProduct.findElement(By.xpath(".//button"));
        firstProductButton.click();
    }

    public int getBadgeCount(){
        String badgeCountText = bucketBadge.getText();
        return Integer.parseInt(badgeCountText);
    }
}
