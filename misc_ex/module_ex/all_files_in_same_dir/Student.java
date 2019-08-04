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
    Person p = new Person("Dragan");
    Student s = new Student("Mila", "UBC");

    System.out.println(p);
    System.out.println(s);
  }
}