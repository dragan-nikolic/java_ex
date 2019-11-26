package support;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ActivityServiceMock {
    static List<Email> emails = new ArrayList<>();
    static List<Note> notes = new ArrayList<>();

    public static void initTestData() {
        Email e1 = new Email(1,"Test Email 1", "dragan", "pera");
        emails.add(e1);
        emails.add(new Email(2,"Test Email 2", "pera", "dragan"));

        notes.add(new Note(100,"Test Note 1", false));
    }

    public static Activity getActivityById(int id) {
        Optional<Email> email = emails.stream().filter(a -> a.id == id).findFirst();

        if (email.isPresent()) {
            return email.get();
        }

        Optional<Note> note = notes.stream().filter(a -> a.id == id).findFirst();

        if (note.isPresent()) {
            return note.get();
        }

        return null;
    }

    public static Activity getActivityByClass(Class<? extends Activity> activityClass) {
        Optional<Email> email = emails.stream().filter(a -> a.getClass() == activityClass).findFirst();

        if (email.isPresent()) {
            return email.get();
        }

        Optional<Note> note = notes.stream().filter(a -> a.getClass() == activityClass).findFirst();

        if (note.isPresent()) {
            return note.get();
        }

        return null;
    }

    public static Activity createCopy(Activity originalActivity) {
        if (originalActivity.getClass() == Email.class) {
            return new Email((Email)originalActivity);
        } else if (originalActivity.getClass() == Note.class) {
            return new Note((Note)originalActivity);
        } else {
            throw new IllegalArgumentException("Unknown Activity!");
        }
    }
}
