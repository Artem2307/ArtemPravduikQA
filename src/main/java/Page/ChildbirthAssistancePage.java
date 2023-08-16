package Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class ChildbirthAssistancePage {
    private static final SelenideElement SENT_TO_EMAIL_BUTTON = $x("//span[contains(text(),'Відправити на email')]");
    private static final SelenideElement STRING_EMAIL = $x("//input[contains(@placeholder,'Твій email')]");
    private static final SelenideElement SEND_EMAIL_BUTTON =$x("//button[@id='modal-send-email-btn']");
    private static final SelenideElement ON_THE_HOME_BUTTON =$x("//a[@class='btn btn_default']");

    @Step("'Відправити на email' кликунуть і вписати email і клікнути на Віправити інструкцію ")
    public void SendEmail(String email){
        ClickSentToEmailButton();
        EnterEmail(email);
        ClickEmailButton();
        ClickHomeButton();
    }
    public void ClickSentToEmailButton(){
        SENT_TO_EMAIL_BUTTON.should(Condition.visible).click();
    }
    public void EnterEmail(String email){
        STRING_EMAIL.should(Condition.visible).sendKeys(email);
    }

    public void ClickEmailButton(){
        SEND_EMAIL_BUTTON.should(Condition.visible).click();
    }
    public void ClickHomeButton(){
        ON_THE_HOME_BUTTON.should(Condition.visible).click();
    }
}
