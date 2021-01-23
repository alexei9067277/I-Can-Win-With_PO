package ICanWinWithPO.test;

import ICanWinWithPO.pagesPO.SearchInfoOnPastebin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1Tests {

    private WebDriver driver;
    protected SearchInfoOnPastebin searchInfoOnPastebin;

    @BeforeMethod(alwaysRun = true)// Метод, после аннотации, должен быть выполнен перед выполнением основного метода. Перед каждым методом, который помечен аннотацией @test
    public void BrowserSetup() {

        driver = new ChromeDriver(); // Объект браузера для драйвера
        driver.manage().window().maximize();
        searchInfoOnPastebin = new SearchInfoOnPastebin(driver);
    }

    @Test
    public void createNewPasteFields() {
        searchInfoOnPastebin.openPage();
        searchInfoOnPastebin.addCodeIntoTextarea("Hello from WebDriver");
        searchInfoOnPastebin.addFieldPasteExpiration();
        searchInfoOnPastebin.addFieldPasteName("helloweb");
        searchInfoOnPastebin.clickToCreateNewPaste();
    }

    @AfterMethod (alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver=null;
    }
}
