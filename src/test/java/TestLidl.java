import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLidl {

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

    @Test
    public void CarritoCompra(){
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        String url = "https://www.lidl.es";

        driver.get(url);

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

    @Test
    public void listarProductos(){
        //Resolvemos el issue para que los test puedan ser desplegados en otras máquinas gracias a la instalación de drivers de selenium
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        String url = "https://www.lidl.es/es/panificadoras/c6229";

        // Navegamos a la pagina de lidl
        driver.get(url);

        //Aceptar las cookies
        WebElement element = driver.findElement(By.className("cookie-alert-extended-button"));

        //Inicializamos un timeout a traves del wait de selenium
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));

        element.sendKeys("cookie-alert-extended-button"+ Keys.ENTER);
    }

    @Test
    public void testListProduct(){
        WebDriverManager.edgedriver().setup();

        WebDriver driver = new EdgeDriver();

        String url = "https://www.lidl.es/es/panificadoras/c6229";

        driver.get(url);

        PageObjectLidl pageObject = new PageObjectLidl(driver);
        pageObject.listProduct();
    }
}
