class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println(".......... Employee Details ..........");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        System.out.println("Default Employee:");
        e1.displayEmployee();

        Employee e2 = new Employee("Sachin", 1, 10000.00);
        System.out.println("Parameterized Employee:");
        e2.displayEmployee();
    }
}
