package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage {
    WebDriver driver;

    @FindBy(xpath = "//h2[text()='Register']")
    WebElement register;
    @FindBy(xpath = "//input[@id='username']")
    WebElement Username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;
    @FindBy(xpath = "//input[@id='confirmPassword']")
    WebElement confirmpass;
    @FindBy(xpath = "//button[text()='Register Now']")
    WebElement registerButton;

     public registerPage(WebDriver driver){
         this.driver=driver;
         PageFactory.initElements(driver,this);

     }
     public void register(String username,String password){
         Username.sendKeys(username);
         Password.sendKeys(password);
         confirmpass.sendKeys(password);
         registerButton.click();
     }
}
