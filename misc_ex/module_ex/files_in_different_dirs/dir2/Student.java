/*
How to run:
- cd to base dir (files_in_different_dirs)
- $ javac dir1/Person.java
- $ javac dir2/Student.java
- $ java dir2.Student

Notes:
- package must be defined for both files
*/
package dir2;
import dir1.Person;


public class Student extends Person {
  private String university;

  public Student(String name, String university) {
    super(name);
    this.university = university;
  }

  public String toString() {
    return super.toString() + " is student at " + university;
  }

  public static void main(String[] args) {
    dir1.Person p = new dir1.Person("Dragan");
    Student s = new Student("Mila", "UBC");

    System.out.println(p);
    System.out.println(s);
  }
}