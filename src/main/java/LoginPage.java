import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage{

    private WebDriver selenium;
    private String str = "RMSys - Sign In";
    private String url = "https://192.168.100.26/";

    public LoginPage(WebDriver selenium){
        this.selenium = selenium;
    }

    public void load(){
        selenium.get(url);
    }

    public void isLoaded(){
        Assert.assertTrue(selenium.getTitle().equals(str));
    }

    private void inputData(String username, String password){
        selenium.findElement(By.cssSelector("#Username")).sendKeys(username);
        selenium.findElement(By.cssSelector("#Password")).sendKeys(password);
    }

    public HomePage login(String username, String password){
        inputData(username, password);
        clickSubmit();
        return new HomePage(selenium);
    }

    private void clickSubmit(){
        selenium.findElement(By.cssSelector("#SubmitButton")).click();
    }
}
