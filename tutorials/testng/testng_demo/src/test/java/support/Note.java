package support;

import lombok.Data;

@Data
public class Note extends Activity {
    private boolean isPrivate;

    public Note(int id, String subject, boolean isPrivate) {
        super(id, subject);
        this.isPrivate = isPrivate;
    }

    public Note(Note other) {
        super(other.id, other.subject);
        this.isPrivate = other.isPrivate;
    }
}
