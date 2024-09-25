package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {

   public WebDriver driver;

        @FindBy(xpath = "//button[@id='add-new-btn']")
        WebElement address;
        @FindBy(xpath = "//button[text()='PLACE ORDER']")
        WebElement placeOrder;
        @FindBy(xpath = "//input[@type='radio']")
        WebElement SelectAddress;

      public checkoutPage(WebDriver driver){
          this.driver = driver;
          PageFactory.initElements(driver, this);
       }
       public void selectAddress(){
           SelectAddress.click();

       }
       public void Placeorder(){
          placeOrder.click();
       }

}


