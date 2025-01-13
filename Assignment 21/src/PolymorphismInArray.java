class Animals {
    public void feed() {
        System.out.println("Feeding animal.");
    }
}

class Dogs extends Animals {
    @Override
    public void feed() {
        System.out.println("Feeding the dog.");
    }
}

class Cats extends Animals {
    @Override
    public void feed() {
        System.out.println("Feeding the cat.");
    }
}

public class PolymorphismInArray {
    public static void main(String[] args) {
        Animals[] animal = new Animals[3];

        animal[0] = new Dogs();
        animal[1] = new Cats();
        animal[2] = new Dogs();

        for (Animals animals : animal) {
            animals.feed();
        }
    }
}
