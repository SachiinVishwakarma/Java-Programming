
class Bike extends Vehicle{
    private String hasSideCar;

    public Bike(int maxSpeed, String color , String hasSideCar){
        super(maxSpeed,color);
        this.hasSideCar=hasSideCar;

    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("HasSideCar in Bike = "+ hasSideCar);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bike example = new Bike(120,"Black", "No");
        example.displayInfo();
    }
}
