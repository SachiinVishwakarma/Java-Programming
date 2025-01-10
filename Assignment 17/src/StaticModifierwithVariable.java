
class CounterClass{
    static int count = 0;

    public CounterClass(){
        count++;
    }

    public void show(){
        System.out.println("Count = "+ count);
    }
}
public class StaticModifierwithVariable {
    public static void main(String[] args) {
        CounterClass example1 = new CounterClass();
        example1.show();
        // here count share data with all instance of class

        CounterClass example2 = new CounterClass();
        example2.show();
    }
}
