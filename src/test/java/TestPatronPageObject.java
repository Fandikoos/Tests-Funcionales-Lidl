
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestPatronPageObject {

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
