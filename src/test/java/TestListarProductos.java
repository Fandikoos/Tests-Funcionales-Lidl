import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TestListarProductos {

    @Test
    public void listarProductos(){
        //Resolvemos el issue para que los test puedan ser desplegados en otras máquinas gracias a la instalación de drivers de selenium
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        // Navegamos a la pagina de lidl
        driver.get("https://www.lidl.es/es/panificadoras/c6229");

        //Aceptar las cookies
        WebElement element = driver.findElement(By.className("cookie-alert-extended-button"));

        //Inicializamos un timeout a traves del wait de selenium
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

        element.sendKeys("cookie-alert-extended-button"+ Keys.ENTER);
    }


}
