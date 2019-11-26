package support;

import lombok.Data;

@Data
public class Activity {
    protected int id;
    protected String subject;

    public Activity() {
        this.id = -1;
        this.subject = null;
    }

    public Activity(int id, String subject) {
        this.id = id;
        this.subject = subject;
    }

    public Activity(Activity other) {
        this.id = other.id;
        this.subject = other.subject;
    }

    @Override
    public boolean equals(Object other) {
        Activity otherA = (Activity)other;
        return id == otherA.id
                && subject.equals(otherA.subject);
    }
}
