package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestListarProductos {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danfa\\Desktop\\TestFuncionalLidl\\TestFuncionalLidl\\src\\main\\resources\\driver\\chromedriver.exe");

        //Este test consistira en listar las panificadoras que se venden en Lidl

        //Inicializamos browser
        WebDriver webDriver = new ChromeDriver();

        // Creamos la nueva instancia
        WebDriver driver = new ChromeDriver();

        // Navegamos a la pagina de lidl
        driver.get("https://www.lidl.es/es/panificadoras/c6229");

        //Aceptar las cookies
        driver.findElement(By.className("cookie-alert-extended-button")).sendKeys("cookie-alert-extended-button"+ Keys.ENTER);

        // Esperamos a que cargue la pagina y cargamos una excepción por si surgiera algún error
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
