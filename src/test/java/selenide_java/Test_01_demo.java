package selenide_java;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.SelectRadio;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/*
1. After create new project it doesn't run to configure
2. click run-->edit configuration-->click tempelete-->click testNG-->Set vm options = -ea  -Dtestng.dtd.http=true
   & by default [Test kind:- Class] that's all. good to go....
==============Selenide by default feature===================
for DOCS:- https://github.com/selenide/selenide/wiki/Selenide-vs-Selenium
1. And run tests with option -Dbrowser=htmlunit (or "chrome" or "ie", default value is "firefox")
2. Auto screenshot on failure & Auto report inside [build folder] when we run class
3. Closes the browser automatically.
4. Default timeout is 4 seconds and it's configurable.
 */

//for more function refer:-  https://github.com/selenide/selenide/tree/master/src/test/java/com/codeborne/selenide/commands

public class Test_01_demo {

    @BeforeClass
    public void setUp(){
        open("http://demo.automationtesting.in/");
    }

    @Test
    public void test_click_setText(){
        $(By.xpath("//img[@id='enterimg']")).click();
        SelenideElement firstName = $(By.cssSelector("input[placeholder='First Name']"));
        firstName.setValue("Johny");
        //Assert
        firstName.shouldHave(value("Johny"));
    }

    @Test
    public void test_element_action_by_text() throws InterruptedException {
        $(By.xpath("//img[@id='enterimg']")).click();
        WebElement fileUploadBtn = $(byText("WebTable"));
        fileUploadBtn.click();
        Thread.sleep(3000);
    }

    @Test
    public void test_other_basic_fnct() throws InterruptedException {
        $(By.xpath("//img[@id='enterimg']")).click();
        selectRadio(By.cssSelector("#checkbox2"), "Movies");

        $(By.xpath("//input[@id='checkbox3']")).setSelected(true);
        $(By.xpath("//input[@id='checkbox3']")).shouldBe(selected);
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown(){
        close();
    }


}
