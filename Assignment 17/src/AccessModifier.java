class TestModifiers{
    public  void publictest(){
        System.out.println("This is Public access modifier!!!!!");
    }
    private void privatetest(){
        System.out.println("This is Private Access Modifier!!!!");
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        TestModifiers example = new TestModifiers();
        //here print publictest method

        example.publictest();
        // See here privatetest has private access in TestModifier So it Can't be accessable
//        example.privatetest();
    }
}
