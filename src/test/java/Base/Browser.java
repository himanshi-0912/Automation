package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Config;

import java.io.IOException;

public class Browser {
public WebDriver driver;
public Config ref;

@BeforeTest
    public void launch() throws IOException {

    ref = new Config(); //to access the methods of config class but indirectly we are invoking the constructor


        if(ref.getProperties("Browser").equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();

        } else if (ref.getProperties("Browser").equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }

        else if (ref.getProperties("Browser").equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();

        }
     driver.get(ref.getProperties("url"));

    }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
    Thread.sleep(3000);
        driver.close();
    }


}
