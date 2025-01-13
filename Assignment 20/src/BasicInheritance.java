class Vehicle{
    private int maxSpeed;
    private String color;

    public Vehicle(int maxSpeed , String color){
        this.maxSpeed=maxSpeed;
        this.color=color;
    }


    public void displayInfo(){
        System.out.println("Max Speed = "+ maxSpeed + " km/hr , Color = "+ color);
    }
}
class Car extends Vehicle{
    private int numberOfDoors;

    public Car (int maxSpeed , String color , int numberOfDoors){
        super (maxSpeed,color);
        this.numberOfDoors=numberOfDoors;

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Number of Doors in Car = "+ numberOfDoors);
    }
}
public class BasicInheritance {
    public static void main(String[] args) {
        Car myFirst = new Car(200, "red", 5);
        myFirst.displayInfo();
    }
}
