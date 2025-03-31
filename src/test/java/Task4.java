import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


        public class Task4 {
            {
                Configuration.pageLoadStrategy = "eager";
                Configuration.browserSize = "1920x1080";
                Configuration.baseUrl = "https://github.com";

            }
            @Test
            void Task4Test1() {
                open("/selenide/selenide");
                $("#wiki-tab").shouldHave(text("wiki")).click();
                $("#wiki-tab").click();
                $$("[href$='SoftAssertions']").first().shouldHave((text("Soft assertions")));
                $$("[href$='SoftAssertions']").first().click();
                $$("h4.heading-element").findBy(text("JUnit5")).should(exist);
                $("#wiki-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class}) " +
                        "class Tests { " +
                        "  @Test " +
                        "  void test() { " +
                        "    Configuration.assertionMode = SOFT; " +
                        "    open(\"page.html\"); " +
                        "    $(\"#first\").should(visible).click(); " +
                        "    $(\"#second\").should(visible).click(); " +
                        "  } " +
                        "}"));
            }}