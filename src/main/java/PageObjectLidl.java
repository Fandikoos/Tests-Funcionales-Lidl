import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectLidl {
    private WebDriver driver;

    public PageObjectLidl(WebDriver driver){
        this.driver=driver;
    }

    public void listProduct(){
        WebElement element = driver.findElement(By.className("cookie-alert-extended-button"));

        //Inicializamos un timeout a traves del wait de selenium
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

        element.sendKeys("cookie-alert-extended-button"+ Keys.ENTER);
    }
}
