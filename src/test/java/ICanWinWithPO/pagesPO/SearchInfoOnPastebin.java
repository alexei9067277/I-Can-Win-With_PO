package ICanWinWithPO.pagesPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchInfoOnPastebin extends AbstractPage{
    public SearchInfoOnPastebin(WebDriver driver){
        super(driver);
    }

    public void openPage() {
        driver.get("https://pastebin.com");
    }

    public void addCodeIntoTextarea(String codeInTextareaField){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-text")))
                .sendKeys(codeInTextareaField); // поиск textarea
    }

    public void addFieldPasteExpiration() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("select2-postform-expiration-container")))
                .click();

        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='select2-results']/descendant::li[text()='10 Minutes']")))
                .click();
    }

    public void addFieldPasteName(String textInTitleField) {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.id("postform-name")));
    }

    public void clickToCreateNewPaste() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit' and contains(text(),'Create New Paste')]")))
                .click();
    }
}
