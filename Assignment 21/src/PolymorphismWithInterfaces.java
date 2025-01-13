interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class PolymorphismWithInterfaces {
    public static void main(String[] args) {
        Shape myShape1 = new Circle();
        myShape1.draw();

        Shape myShape2 = new Rectangle();
        myShape2.draw();
    }
}
