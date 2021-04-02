package selenide_java;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test_02_Click_SendKeys_GetText extends Base{

    @Test
    public void test_click_Sendkeys_GetText() {
        open("http://demo.automationtesting.in/");
        $(By.xpath("//img[@id='enterimg']")).click();

        SelenideElement firstName = $(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("david");
        firstName.shouldHave(value("david"));

        System.out.println(firstName.getAttribute("value"));
        System.out.println($(By.xpath("//h2[normalize-space()='Register']")).getText());

    }
}
