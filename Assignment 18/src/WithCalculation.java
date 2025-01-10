import java.util.Scanner;

class Customer{
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative.");
        }
    }

    public int calculateRetirementYear(int currentYear) {
        int retirementAge = 65;
        return currentYear + (retirementAge - age);
    }
}

public class WithCalculation {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Customer example = new Customer();

        System.out.print("Enter your age: ");
        int userAge = myObj.nextInt();
        example.setAge(userAge);

        int currentYear = 2023;
        int retirementYear = example.calculateRetirementYear(currentYear);

        System.out.println("Retirement Year: " + retirementYear);
    }
}
