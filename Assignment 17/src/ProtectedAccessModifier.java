import java.awt.*;

class Parent{
    protected void show(){
        System.out.println("This is a protected access modifier .. ");
    }
}
 class Child extends Parent{
    public void display(){
        show();
    }
 }

public class ProtectedAccessModifier {
    public static void main(String[] args) {
        Child example = new Child();
        example.display();

    }
}
