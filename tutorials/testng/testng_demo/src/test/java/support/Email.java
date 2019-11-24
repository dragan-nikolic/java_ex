package support;

import lombok.Value;

@Value
public class Email extends Activity {
    private String from;
    private String to;

    public Email(int id, String subject, String from, String to) {
        super(id, subject);
        this.from = from;
        this.to = to;
    }
}
