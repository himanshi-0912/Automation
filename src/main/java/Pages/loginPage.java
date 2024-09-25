package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
   public WebDriver driver;
   @FindBy(xpath = "//h2[text()='Login']")
    WebElement login;
    @FindBy(xpath ="//input[@id='username']")
    WebElement username ;
    @FindBy(xpath ="//input[@id='password']")
    WebElement password ;
    @FindBy(xpath ="//button[text()='Login to QKart']")
    WebElement loginButton;

    public loginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void dologin(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }
}
