package Setting;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

public class SelenidSetting {
    public  void setting(){
        Configuration.browser = "FireFox";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://diia.gov.ua/");//1. Відкрити головну сторінку https://diia.gov.ua.
    }

}

