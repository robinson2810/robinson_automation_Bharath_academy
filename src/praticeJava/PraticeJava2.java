package praticeJava;

class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println(name + " - " + age);
    }
    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    void display() {
        System.out.println(name + " - " + age);
    }
}

public class PraticeJava2 {
    public static void main(String[] args) {

        Student s1 = new Student();              // Calls default constructor
        Student s2 = new Student("Rahul", 20);  // Calls parameterized constructor

//        s1.display();
        s2.display();
    }
}
