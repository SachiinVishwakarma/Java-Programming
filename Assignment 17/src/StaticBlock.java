class InitializationClass {
    static int value;

    // Static block to initialize the static variable
    static {
        System.out.println("Static block executed.");
        value = 6;
    }

    // Method to display the value of the static variable
    public static void display() {
        System.out.println("Value of static variable: " + value);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method..");
        InitializationClass.display();
    }
}
