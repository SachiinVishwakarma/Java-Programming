import java.util.ArrayList;
import java.util.Scanner;

// Employee class
class Employee {
    String name;
    int employeeId;
    String department;
    double salary;

    // Constructor
    public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        if (salary < 0) {
            System.out.println("Invalid salary. Setting salary to 0.");
            this.salary = 0;
        } else {
            this.salary = salary;
        }
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        if (newSalary < 0) {
            System.out.println("Error: Salary cannot be negative.");
        } else {
            this.salary = newSalary;
            System.out.println("Salary updated successfully.");
        }
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("-----------------------");
    }
}

// Main class
public class EmployeeInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nEmployee Information System Menu:");
            System.out.println("1. Add an Employee");
            System.out.println("2. Update Employee Salary");
            System.out.println("3. Display Employee Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add an employee
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    Employee employee = new Employee(name, id, department, salary);
                    employees.add(employee);
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    // Update salary
                    System.out.print("Enter Employee ID to update salary: ");
                    int searchId = scanner.nextInt();
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.employeeId == searchId) {
                            System.out.print("Enter new salary: ");
                            double newSalary = scanner.nextDouble();
                            emp.updateSalary(newSalary);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    // Display employee details
                    if (employees.isEmpty()) {
                        System.out.println("No employees to display.");
                    } else {
                        System.out.println("\nEmployee Details:");
                        for (Employee emp : employees) {
                            emp.displayDetails();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting the Employee Information System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

    }
}
