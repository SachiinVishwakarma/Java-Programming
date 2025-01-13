class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}
class Manager extends Employee{
    private String department;
    public Manager(String name , int employeeId, String department){
        super(name, employeeId);
        this.department=department;
    }

    public void manageTeam() {
        System.out.println("Managing team is in "+ department + "Department.");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department : "+ department);
    }
}

class Executive extends Manager{
    private int noOfMeetings;

    public Executive(String name , int employeeId , String department , int noOfMeetings){
        super(name, employeeId, department);
        this.noOfMeetings=noOfMeetings;
    }
    public void Meeting(){
        System.out.println("Aaj Aapka "+ noOfMeetings+ " Meeting Hai . ");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of meeting : "+ noOfMeetings);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Executive example = new Executive("Satyam", 1, "CEO",5);
        example.display();
        example.Meeting();
    }
}
