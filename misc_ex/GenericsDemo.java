import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static class Note {
        public int noteId;
    }

    public static class Email {
        public String subject;
    }

    public static <T> void checkIsEmpty(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("List is emtpy :(");
        } else {
            System.out.println("List is not empty :)");
        }
    }

    public static void testCheckIsEmpty() {
        List<Note> notes = new ArrayList<>();
        notes.add(new Note());

        checkIsEmpty(notes);

        notes.remove(0);
        checkIsEmpty(notes);
    }

    public static void main(String args[]) {
        testCheckIsEmpty();
    }
}