
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPatronPageObject {

    @Test
    public void testListProduct(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danfa\\Desktop\\TestFuncionalLidl\\TestFuncionalLidl\\src\\main\\resources\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.lidl.es/es/panificadoras/c6229");

        PageObjectLidl pageObject = new PageObjectLidl(driver);
        pageObject.listProduct();
    }
}
