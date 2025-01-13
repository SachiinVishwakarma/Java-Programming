class Vehicle {
    public void display() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a car.");
    }
}

class Bike extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a bike.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.display();

        myVehicle = new Car();
        myVehicle.display();

        myVehicle = new Bike();
        myVehicle.display();
    }
}
