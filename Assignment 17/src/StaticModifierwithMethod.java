class GreetingClass{
    public static void greet(){
        System.out.println("Heyyyy This is Static Method !");
    }
}
public class StaticModifierwithMethod {
    public static void main(String[] args) {
        GreetingClass example= new GreetingClass();
        example.greet();

    }
}
