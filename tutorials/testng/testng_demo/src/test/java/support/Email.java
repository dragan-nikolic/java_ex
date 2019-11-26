package support;

import lombok.Data;

@Data
public class Email extends Activity {
    private String from;
    private String to;

    public Email(int id, String subject, String from, String to) {
        super(id, subject);
        this.from = from;
        this.to = to;
    }

    public Email(Email other) {
        super(other);
        this.from = other.from;
        this.to = other.to;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (other == null || other.getClass() != this.getClass()) {
            return false;
        }

        Email otherEmail = (Email) other;

        return super.equals(other)
                && from.equals(otherEmail.from)
                && to.equals(otherEmail.to);
    }
}
