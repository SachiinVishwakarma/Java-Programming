class Animal{

    private String name;

    public Animal(String name ){
        this.name=name;
    }
    public void display(){
        System.out.println("Name = "+name);
    }
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    public void bark() {
        System.out.println("Dog is barking : Bho Bho ");
    }
}

class Cat extends Animal{
    public Cat(String name ){
        super(name);
    }

    public void purr() {
        System.out.println("The cat is purring : I don't know ");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Chinu");
        myDog.display();
        myDog.bark();

        Cat myCat = new Cat("Satyam");
        myCat.display();
        myCat.purr();
    }
}
