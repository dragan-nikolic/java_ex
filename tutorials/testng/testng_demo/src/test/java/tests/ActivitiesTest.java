package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import support.Activity;
import support.ActivityServiceMock;
import support.Email;
import support.Note;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.reflect.FieldUtils;

@SuppressWarnings("unchecked")
public class ActivitiesTest {
    @BeforeClass(alwaysRun = true)
    public void initTestData() {
        ActivityServiceMock.initTestData();
    }

    @Test
    public void emailTest() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        performTest(Email.class);
    }

    @Test
    public void noteTest() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        performTest(Note.class);
    }

    @Test
    public void checkEmailDoesNotHaveIdFieldTest() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Email email = (Email)ActivityServiceMock.getActivityByClass(Email.class);

        Field[] fields = email.getClass().getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field.getName());
        }

        Optional<Field> field = Arrays.stream(fields).filter(f -> f.getName().equals("id")).findFirst();

        Assert.assertFalse(field.isPresent());
    }

    @Test
    public void checkEmailParentHasIdFieldTest() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Email email = (Email)ActivityServiceMock.getActivityByClass(Email.class);

        Field[] fields = FieldUtils.getAllFields(email.getClass());
        for (Field field: fields) {
            System.out.println("***** Field: " + field.getName());
        }

        Optional<Field> field = Arrays.stream(fields).filter(f -> f.getName().equals("id")).findFirst();

        Assert.assertTrue(field.isPresent());
    }

    private <T extends Activity> void performTest(Class<T> activityClass) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("This is " + activityClass.getName() + " test!");

        T originalActivity = (T)ActivityServiceMock.getActivityByClass(activityClass);
        T copyActivity = (T)ActivityServiceMock.createCopy(originalActivity);

        Assert.assertEquals(originalActivity, copyActivity);
    }
}
