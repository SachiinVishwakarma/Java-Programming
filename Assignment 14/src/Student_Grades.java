import java.util.ArrayList;

// Student class definition
class Student {

    // Instance variables
    private String name;
    private int studentId;
    private int[] grades;

    // Constructor to initialize student details
    public Student(String name, int studentId, int[] grades) {
        this.name = name;
        this.studentId = studentId;
        this.grades = grades;
    }

    // Method to calculate the average of grades
    public double calculateAverage() {
        double Average;
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return( double Average =( total / grades.length))
    }

    // Method to check if the student has passed
    public boolean hasPassed() {
        double average = calculateAverage();
        return average >= 60; // Passing grade is 60 or above
    }

    // Method to display the student's details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Average Grade: " + Average);
        System.out.println("Passed: " + (hasPassed() ? "Yes" : "No"));
        System.out.println();
    }
}

// Gradebook class definition
class Gradebook {


    private ArrayList<Student> students;

    // Constructor
    public Gradebook() {
        students = new ArrayList<>();
    }

    // Method to add a student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all
    public void displayStudentInfo() {
        for (Student student : students) {
            student.displayDetails();
        }
    }
}

public class Student_Grades {
    public static void main(String[] args) {

        // Create a Gradebook instance
        Gradebook gradebook = new Gradebook();

        // Create students with their grades and add them to the gradebook
        Student student1 = new Student("Pawan", 101, new int[] {85, 90, 88});
        Student student2 = new Student("Sachin", 102, new int[] {55, 60, 58});
        Student student3 = new Student("Prem", 103, new int[] {75, 80, 82});

        // Add students to the gradebook
        gradebook.addStudent(student1);
        gradebook.addStudent(student2);
        gradebook.addStudent(student3);

        // Display information about all students
        gradebook.displayStudentInfo();
    }
}
