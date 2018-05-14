package junit.org.steps;

import junit.org.model.Category;
import junit.org.ui.JunitHomePage;
import net.thucydides.core.annotations.Step;

public class NavigatingUser {

    JunitHomePage junitHomePage;

    @Step
    public void isOnTheHomePage() {
        junitHomePage.open();
    }

    @Step
    public void navigatesToCategory(Category category) {

    }

    @Step
    public void shouldSeePageTitle(String expectedTitle) {
    }
}
