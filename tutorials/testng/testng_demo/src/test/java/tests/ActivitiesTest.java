package tests;

import org.testng.annotations.Test;
import support.Activity;
import support.Email;

public class ActivitiesTest {
    @Test
    public void EmailTest() throws InstantiationException, IllegalAccessException {
        performTest(Email.class);
    }

    private <T extends Activity> void performTest(Class<T> activityClass) throws IllegalAccessException, InstantiationException {
        System.out.println("This is " + activityClass.getName() + " test!");

        T activity = activityClass.newInstance(100, "purchase");
    }
}
