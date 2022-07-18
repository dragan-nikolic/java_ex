/*
This is Hello World java app :)

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file> 

Note: do not run with class extension 'java <file>.class'
*/
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

// name of the class must be same as name of the file
public class JsonTester {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        String json = "{\"id\" : 1}";
        Student student = mapper.readerFor(Student.class).readValue(json);
        System.out.println(student.getTheId());    
    }
}

class Student {
    private int id;

    Student(){}

    Student(int id){
       this.id = id;
    }

    @JsonProperty("id")
    public int getTheId() {
       return id;
    }

    @JsonProperty("id")
    public void setTheId(int id) {
       this.id = id;
    }   
 }
