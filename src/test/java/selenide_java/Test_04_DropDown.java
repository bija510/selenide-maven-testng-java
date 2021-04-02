package selenide_java;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test_04_DropDown extends Base {

    @Test
    public void test_dropdown() throws InterruptedException {
        open("https://learn.letskodeit.com/p/practice");
        SelenideElement dropdown = $(By.xpath("//select[@id='carselect']"));
        dropdown.selectOption(2);
        Thread.sleep(1000);
        dropdown.selectOption("Benz");
        Thread.sleep(1000);
        dropdown.selectOptionContainingText("BMW");
        Thread.sleep(1000);
        dropdown.selectOptionByValue("honda");
        Thread.sleep(1000);
    }

}
