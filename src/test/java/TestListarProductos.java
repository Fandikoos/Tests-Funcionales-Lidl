import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestListarProductos {

    @Test
    public void listarProductos(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danfa\\Desktop\\TestFuncionalLidl\\TestFuncionalLidl\\src\\main\\resources\\driver\\chromedriver.exe");

        //Este test consistira en listar las panificadoras que se venden en Lidl

        // Creamos la nueva instancia
        WebDriver driver = new ChromeDriver();

        // Navegamos a la pagina de lidl
        driver.get("https://www.lidl.es/es/panificadoras/c6229");

        //Aceptar las cookies
        WebElement element = driver.findElement(By.className("cookie-alert-extended-button"));

        //Inicializamos un timeout a traves del wait de selenium
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

        element.sendKeys("cookie-alert-extended-button"+ Keys.ENTER);

        driver.quit();
    }


}
