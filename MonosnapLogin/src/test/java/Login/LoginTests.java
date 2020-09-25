package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import chromedriver

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //Import selenium webDriver
        private WebDriver driver;
        WebDriver driver = new ChromeDriver();
        //Input project URL = Monosnap URL
        driver.get("https://monosnap.com/auth");
        //Wait for loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Maximize page
        driver.manage().window().maximize();
        //Get page title
        System.out.println(driver.getTitle());
        //Get username
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[1]")).sendKeys("osarenrenebuwa@gmail.com");
        //Get password
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[2]")).sendKeys("ebuwatests");
        //Get sign in button
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
        //Wait
        Thread.sleep(10000);
        //Close window
        driver.quit();


    }
    public static void main(String[] args) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();

    }
}
