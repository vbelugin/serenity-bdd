package junit.org.features.navigation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import junit.org.model.Category;
import junit.org.steps.NavigatingUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenBrowsingDocumentation {

    @BeforeClass
    public static void setup() {
        ChromeDriverManager.getInstance().setup();
    }

    @Steps
    private
    NavigatingUser user;

    @Managed(driver = "chrome")
    WebDriver browser;

    @Test
    public void shouldBeAbleToOpenJavadocPage() {
        //Given
        user.isOnTheHomePage();

        //When
        user.navigatesToCategory(Category.Javadoc);

        //Then
        user.shouldSeePageTitle("JUnit 5.2.0 API");
    }
}
