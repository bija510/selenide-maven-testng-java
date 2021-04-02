package selenide_java;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.checked;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test_08_Assert extends Base{

    @Test
    public void test_asssert() {
        open("https://learn.letskodeit.com/p/practice");

        SelenideElement firstName = $(By.xpath("//input[@id='name']"));
        firstName.sendKeys("david");
        firstName.shouldHave(value("david"));

        SelenideElement hondaChk = $(By.cssSelector("#hondacheck"));
        hondaChk.click();
        hondaChk.shouldBe(checked);
    }

}
