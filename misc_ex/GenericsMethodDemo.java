import java.util.ArrayList;
import java.util.List;

public class GenericsMethodDemo {
    public static <T> void checkIsEmpty(List<T> list) {
        if (list.isEmpty()) {
            System.out.println("List is emtpy :(");
        } else {
            System.out.println("List is not empty :)");
            String className = list.get(0).getClass().getTypeName();
            System.out.println("class name is: " + className);
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

class Note {
    public int noteId;
}

class Email {
    public String subject;
}

