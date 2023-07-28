import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.BookPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    BookPage bookPage;


    @BeforeMethod
    public void setup(){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,30);
        bookPage = new BookPage(driver);
        String url = "https://ksrtc.in/oprs-web/guest/home.do";
        driver.navigate().to(url);

    }

    @AfterMethod
    public void quitWebDriver(){
        driver.quit();
    }
}
