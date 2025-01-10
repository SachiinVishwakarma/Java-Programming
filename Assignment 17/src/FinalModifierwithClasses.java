final class FinalClass{
    public void show(){
        System.out.println(" This Class is  with final keyword");
    }
}

//cannot inherit from final FinalClass

//class ChildClass extends FinalClass{
//    public void show(){
//        System.out.println(" This Class is extends class with final keyword");
//    }
//}
public class FinalModifierwithClasses {
    public static void main(String[] args) {
        FinalClass example = new FinalClass();
        example.show();
    }
}
