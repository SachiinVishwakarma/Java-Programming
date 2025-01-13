class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(int maxSpeed , String color, int loadCapacity){
        super(maxSpeed, color);
        this.loadCapacity=loadCapacity;
    }

    public void dispalyInfo(){
        super.displayInfo();
        System.out.println("Load Capacity of Truck = "+loadCapacity+" kg");
    }

}
public class UseSuper {
    public static void main(String[] args) {
        Truck example= new Truck(200, "Orange ",5000);
        example.dispalyInfo();
    }
}
