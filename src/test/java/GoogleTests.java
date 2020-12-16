import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @BeforeEach
    public void setUp() {
        Configuration.startMaximized = true;
    }

    @Test
    public void googleTest() {

        open("https://www.google.com/");
        $("[name=q]").val("selenide").pressEnter();
        $(byText("ru.selenide.org")).shouldBe(Condition.visible);
    }

    @Test
    public void mailRuTest() {
        open("https://mail.ru/");
        $("#q").val("QA.GURU").pressEnter();
        $(".result").shouldHave(text("QA.GURU"));
    }
}
