import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;

public class TestCarritoCompra {

    @Test
    public void CarritoCompra(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danfa\\Desktop\\TestFuncionalLidl\\TestFuncionalLidl\\src\\main\\resources\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lidl.es");

        driver.findElement(By.className("cookie-alert-extended-button")).sendKeys("cookie-alert-extended-button" + Keys.ENTER);

        WebElement elementSearch = driver.findElement(By.id("mainsearch-input"));

        WebDriverWait waitSearch = new WebDriverWait(driver, 10);
        waitSearch.until(ExpectedConditions.visibilityOf(elementSearch));

        elementSearch.sendKeys("bateria" + Keys.ENTER);

        WebElement product = driver.findElement(By.id("product_497648"));

        WebDriverWait waitProduct = new WebDriverWait(driver, 10);
        waitProduct.until(ExpectedConditions.visibilityOf(product));

        product.sendKeys("product_497648" + Keys.ENTER);

        WebElement shoppingCart = driver.findElement(By.id("add-to-cart"));

        WebDriverWait waitShoppingCart = new WebDriverWait(driver, 10);
        waitShoppingCart.until(ExpectedConditions.visibilityOf(shoppingCart));

        shoppingCart.sendKeys("add-to-cart" + Keys.ENTER);

        System.out.println("Page title is: " + driver.getTitle());
    }
}