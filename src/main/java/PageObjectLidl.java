import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectLidl {
    private WebDriver driver;

    public PageObjectLidl(WebDriver driver){
        this.driver=driver;
    }

    public void addToCartButton(){
        WebElement addToCart = driver.findElement(By.id("add-to-cart"));
        addToCart.click();
    }
}
