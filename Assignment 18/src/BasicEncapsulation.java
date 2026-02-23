class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null&&!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be null or empty.");

        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}

public class BasicEncapsulation {
    public static void main(String[] args) {
        Person example = new Person();
        example.setName("Sachin");
        System.out.println("Name: " + example.getName());

        example.setAge(25);
        System.out.println("Age: " + example.getAge());
    }
}

