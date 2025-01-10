import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Student {
    String name;
    int rollNumber;
    String address;
    int marks;
    String status;

    public Student(String name, int rollNumber, String address, int marks, String status) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        this.marks = marks;
        this.status = status;
    }
}

public class CreatePDFWithList {
    public static void main(String[] args) {
        List<Student> listofStudent= new ArrayList<>();
        listofStudent.add(new Student("Rahul Sharma", 101, "Delhi", 85, "Pass"));
        listofStudent.add(new Student("Priya Singh", 102, "Mumbai", 72, "Pass"));
        listofStudent.add(new Student("Arjun Verma", 103, "Bangalore", 59, "Fail"));
        listofStudent.add(new Student("Anjali Patel", 104, "Ahmedabad", 91, "Pass"));
        listofStudent.add(new Student("Rohan Das", 105, "Kolkata", 47, "Fail"));


        try (FileOutputStream fos = new FileOutputStream("student.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {


            bos.write("Roll\tName\t\t\tAddress\t\t\tMarks\tStatus\n".getBytes());
            bos.write("----------------------------------------------------------\n".getBytes());


            for (Student student : listofStudent) {
                bos.write((student.rollNumber + "\t").getBytes());
                bos.write((student.name + "\t").getBytes());
                bos.write((student.address + "\t").getBytes());
                bos.write((student.marks + "\t").getBytes());
                bos.write((student.status + "\n").getBytes());
            }

            bos.flush();
            System.out.println("Student data written to 'student.txt' successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
