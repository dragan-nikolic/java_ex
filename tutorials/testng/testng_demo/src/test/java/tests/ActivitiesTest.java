package tests;

import org.testng.annotations.Test;
import support.Email;

public class ActivitiesTest {
    @Test
    public void EmailTest() {
        performTest(Email.class);
    }

    private <T> void performTest(Class<T> activityClass) {
        System.out.println("This is " + activityClass.getName() + " test!");
    }
}
