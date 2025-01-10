final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ImmutablePersonTest {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Jane", 45);

        System.out.println("Person created with Name: " + person.getName() + " and Age: " + person.getAge());
        // Error: Cannot modify final field 'name'
        // person.setName("John");
        // Error: Cannot modify final field 'age'
        // person.setAge(30);
    }
}
