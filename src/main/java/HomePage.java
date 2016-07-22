import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver selenium;



    public HomePage(WebDriver selenium) {
        this.selenium = selenium;
    }

    public LoginPage signOut(){
        signOutClick();
        return new LoginPage(selenium);
    }

    private void signOutClick(){

        selenium.findElement(By.cssSelector(".sign-out-span>a")).click();
    }

    public boolean isSignoutPresent(){

        return selenium.findElement(By.cssSelector(".sign-out-span>a")).isDisplayed();
    }
}
