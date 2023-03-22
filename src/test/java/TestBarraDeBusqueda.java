import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBarraDeBusqueda {

    @Test
    public void BarraDeBusqueda(){
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        String url = "https://www.lidl.es";

        // Navegamos a la pagina de lidl
        driver.get(url);

        //Aceptar las cookies
        driver.findElement(By.className("cookie-alert-extended-button")).sendKeys("cookie-alert-extended-button"+ Keys.ENTER);

        //Busque algo en la barra de búsqueda
        WebElement element = driver.findElement(By.id("mainsearch-input"));

        //Inicializamos un timeout a traves del wait de selenium
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

        element.sendKeys("vino" + Keys.ENTER);

        //Pintamos la pagina
        System.out.println("Page title is: " + driver.getTitle());
    }
}
