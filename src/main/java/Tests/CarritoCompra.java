package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarritoCompra {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danfa\\Desktop\\TestFuncionalLidl\\TestFuncionalLidl\\src\\main\\resources\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lidl.es");

        driver.findElement(By.className("cookie-alert-extended-button")).sendKeys("cookie-alert-extended-button" + Keys.ENTER);

        driver.findElement(By.id("mainsearch-input")).sendKeys("bateria" + Keys.ENTER);

        driver.findElement(By.id("product_497648")).sendKeys("product_497648" + Keys.ENTER);

        driver.findElement(By.id("add-to-cart")).sendKeys("add-to-cart" + Keys.ENTER);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Page title is: " + driver.getTitle());
    }

}
