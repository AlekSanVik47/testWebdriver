import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebdriver {
    WebDriver driver;

    @BeforeAll
    static void setupClass() {
        ChromeDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testDriver (){
        System.setProperty("webdriver.chrome","/usr/local/share/chromedriver/");
        driver.get("https://dom.mail.ru/countryside/");
    }
}
