import java.util.Scanner;

class Student {
    private String name;
    private int studentid;
    private float gpa;

    public Student(String name , int studentid,float gpa){
        this.name=name;
        this.studentid=studentid;
        this.gpa=gpa;
    }

    public void display(){
        System.out.println("Student name = "+name);
        System.out.println("Student id = "+studentid);
        System.out.println("Student GPA = "+gpa);
        if(gpa>3.5){
            System.out.println("Yes Student is in honor roll");
        }
        else{
            System.out.println("NO Student is not in honor roll");
        }
    }
}

public class Testing {
    public static void main(String[] args) {
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter Student name ");
        String name = myObj.nextLine();
        System.out.println("Enter Student ID - ");
        int id= myObj.nextInt();
        System.out.println("Enter GPA");
        float gpa= myObj.nextFloat();
        Student example = new Student(name,id,gpa);
    example.display();

    }
}
