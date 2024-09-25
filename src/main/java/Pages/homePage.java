package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utils.Config;

import java.io.IOException;

public class homePage {

    public WebDriver driver;

    @FindBy(xpath = "//div[@class='header-title MuiBox-root css-0']//img[@alt='QKart-icon']")
    WebElement header;
    @FindBy(xpath = "//div[@class='MuiFormControl-root MuiTextField-root search-desktop css-i44wyl']//input[@name='search']")
    WebElement search;
    @FindBy(xpath = "(//button[text()='Add to cart'])[1]")
    WebElement addToCart;
    @FindBy(xpath = "//img[@alt='Roadster Mens Running Shoes']/following-sibling::div/following-sibling::div//select[@name='age']")
    WebElement size;
    @FindBy(xpath = "//button[text()='Checkout']")
    WebElement checkoutButton;
   // @FindBy(xpath="//img[@alt='Kindle']/following-sibling::div//p[@class='MuiTypography-root MuiTypography-body1 css-yg30e6']")
   // WebElement product2;
    public homePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void searchProduct(String Product1){
        search.sendKeys(Product1);

    }
    public void addTokart(){
        Select dropdown =new Select(size);
        dropdown.selectByVisibleText("9");
        addToCart.click();
    }

    public void checkout(){
        checkoutButton.click();
    }

    public void HeaderDisplay() {

        System.out.println( header.getText());
    }

    public void searchProduct2(String Product2){
        search.sendKeys(Product2);
    }
    public void addCart(){
        addToCart.click();
    }





}
