
abstract class Animal {
    abstract public void walk();

}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on two legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();

    }
}
