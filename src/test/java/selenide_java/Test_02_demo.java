package selenide_java;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class Test_02_demo {

    @Test
    public void test_refreshForwardBac() throws InterruptedException {
        open("http://demo.automationtesting.in/");
        $(By.xpath("//img[@id='enterimg']")).click();
        refresh();
        Thread.sleep(1000);
        back();
        Thread.sleep(1000);
        forward();
    }

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


    @Test
    public void test_CheckBx_RadioBtn() throws InterruptedException {
        open("https://learn.letskodeit.com/p/practice");
        $(By.cssSelector("#hondacheck")).click(); //checkBox
        $(By.cssSelector("#benzradio")).selectRadio("benz");
    }

    @Test
    public void test_url_title() {
        open("https://learn.letskodeit.com/p/practice");
        System.out.println("==> " + url());
        System.out.println("==> " + title());
        System.out.println("==> " + source());
    }

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

    @Test
    public void test_implicitWait() throws InterruptedException {
        open("http://demo.automationtesting.in/Loader.html");
        //no need it auto wait for 4 sec
    }

    @Test
    public void test_explicitWait() {
        open("http://demo.automationtesting.in/Loader.html");

    }

    @Test
    public void test_datePicker(){

    }

    @Test
    public void test_frames() throws InterruptedException {
        open("https://letskodeit.teachable.com/pages/practice");
        executeJavaScript("window.scrollTo(0, 1200)" );
        switchTo().frame("courses-iframe");
        $(By.id("search-courses")).sendKeys("python");
        Thread.sleep(2000);
        switchTo().defaultContent();
        executeJavaScript("window.scrollTo(0, -1200)");
        $(By.id("name")).sendKeys("Robert");
        Thread.sleep(2000);
    }

    @Test
    public void test_multipleWindow(){

    }

    @Test
    public void test_webTable(){

    }

    @Test
    public void test_alert() throws InterruptedException {
        open("https://www.rahulshettyacademy.com/AutomationPractice/");
        $(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(2000);
        confirm("Hello , share this practice page and share your knowledge");
        Thread.sleep(2000);

        $(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(2000);
        dismiss("Hello , share this practice page and share your knowledge");
        Thread.sleep(2000);
    }

    @Test
    public void test_keywordEvent(){

    }

    @Test
    public void test_mouseEvent(){

    }














}
