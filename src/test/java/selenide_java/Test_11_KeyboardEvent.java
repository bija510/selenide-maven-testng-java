package selenide_java;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class Test_11_KeyboardEvent extends Base {

    @Test
    public void test_keywordEvent() throws InterruptedException {
        open("https://www.rahulshettyacademy.com/AutomationPractice/");
        SelenideElement autoSuggestTxt = $(By.xpath("//input[@id='autocomplete']"));
        autoSuggestTxt.sendKeys("ind");
        Thread.sleep(2000);
        autoSuggestTxt.sendKeys(Keys.chord(Keys.ARROW_DOWN, Keys.ENTER));
        Thread.sleep(2000);
    }

}
