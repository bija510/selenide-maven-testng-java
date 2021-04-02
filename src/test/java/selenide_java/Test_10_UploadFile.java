package selenide_java;

import org.testng.annotations.Test;
import java.io.File;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Test_10_UploadFile extends Base{

    @Test
    public void test_uploadFile() throws InterruptedException {
        open("http://demo.automationtesting.in/FileUpload.html");
        String uploadFilePath = System.getProperty("user.dir")+"\\Include\\Upload file.pdf";
        $("[id='input-4']").uploadFile(new File(uploadFilePath));
        Thread.sleep(2000);
    }
}

