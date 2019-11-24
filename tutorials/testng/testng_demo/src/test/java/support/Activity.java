package support;

import lombok.Value;

@Value
public class Activity {
    private int id;
    private String subject;

    public Activity(int id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    public Activity(Activity other) {
        this.id = other.id;
        this.subject = other.subject;
    }
}
