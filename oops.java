class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("i am writing");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String FirstName;
    String LastName;
    String section;
    int age;

    public void printStudentDetails() {
        System.out.println("FirstName" + " " + FirstName + " " + "LastName" + " " + LastName + " " + "Age" + " " + age
                + " " + "section" + " " + section);
    }

    public void printPolymorphismDetails(String FirstName) {
        System.out.println(this.FirstName);
    }

    public void printPolymorphismDetails(String FirstName, String LastName) {
        System.out.println(this.FirstName + " " + this.LastName);
    }

    public void printPolymorphismDetails(int age) {
        System.out.println(this.age);
    }
}

public class oops {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();
        // System.out.println(pen1.color);
        pen1.printColor();
        Student student = new Student();
        student.FirstName = "suraj";
        student.LastName = "Maurya";
        student.age = 24;
        student.section = "fourth";
        student.printStudentDetails();
        student.printPolymorphismDetails(student.FirstName, student.LastName);
        student.printPolymorphismDetails(student.age);
    }

}