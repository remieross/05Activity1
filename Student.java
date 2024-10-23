public class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "No name yet.";
        this.age = 0;
    }

    // Overloaded constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age; // Fixed the assignment operator
    }

    // Getter methods for name and age (optional but useful)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Using the overloaded constructor to create a Student object
        Student student1 = new Student("Ross Vegas", 21);

        // Printing the details of the student
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
    }
}
