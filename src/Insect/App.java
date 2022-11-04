package Insect;

public class App {
    public static void main(String[] args) {
        Bee bee = new Bee(2, "black", 4);

        bee.move();
        bee.attack();
    }
}
