class Superclass{
    final public void show(){
        System.out.println("This is superclass's show method with final keyword");
    }
}
class derrived extends Superclass{
//    show() in derrived cannot override show() in Superclass overridden method is final
//    @Override
//    public void show(){
//        System.out.println("This is derrived classs");
//    }
}
public class FinalModifierWithMethod {
    public static void main(String[] args) {
        Superclass example = new Superclass();
        example.show();
    }
}
