package testcases;

import Base.Browser;
import Pages.checkoutPage;
import Pages.homePage;
import Pages.loginPage;
import org.testng.annotations.Test;
import utils.Config;

import java.io.IOException;

public class SearchProductTestcase extends Browser {
//WebDriver driver;
    @Test
    public void testcase1() throws IOException, InterruptedException {

        Config config = new Config();
        loginPage login = new loginPage(driver);
        homePage home = new homePage(driver);

        login.dologin(config.getProperties("username"),config.getProperties("password"));
        Thread.sleep(5000);
        home.searchProduct(config.getProperties("Product1"));
        Thread.sleep(5000);
       /* home.addTokart();
        Thread.sleep(5000);
        home.checkout();
*/
    }
    @Test
    public void testcase2() throws IOException, InterruptedException {

        Config obj = new Config();
        loginPage obj1 = new loginPage(driver);
        homePage obj2 = new homePage(driver);

        obj1.dologin(obj.getProperties("username"),obj.getProperties("password"));
        Thread.sleep(5000);
        obj2.searchProduct2(obj.getProperties("Product2"));
        Thread.sleep(5000);
        obj2.addCart();
        Thread.sleep(2000);
        obj2.checkout();
        Thread.sleep(5000);
        checkoutPage checkout = new checkoutPage(driver);
        checkout.selectAddress();
        Thread.sleep(5000);
        checkout.Placeorder();
        Thread.sleep(5000);
    }
}
