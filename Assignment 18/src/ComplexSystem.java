class Employee extends Person {

    private int employeeId;
    private String department;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        if (employeeId > 0) {
            this.employeeId = employeeId;
        } else {
            System.out.println("Error: Employee ID must be positive.");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.trim().isEmpty()) {
            this.department = department;
        } else {
            System.out.println("Error: Department cannot be null or empty.");
        }
    }
}
public class ComplexSystem {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee();

        // Test Case 1: Set and get employeeId
        employee.setEmployeeId(1001);
        System.out.println("Employee ID: " + employee.getEmployeeId());

        // Test Case 2: Set and get department
        employee.setDepartment("Engineering");
        System.out.println("Department: " + employee.getDepartment());
    }
}