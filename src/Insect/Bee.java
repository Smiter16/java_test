package Insect;

public class Bee extends Insect {

    private int count;

    public Bee(int size, String color, int count) {
        super(size, color);
        this.count = count;

    }

    @Override
    public void move() {
        super.move();
        System.out.println("1 - bee");
    }

    @Override
    public void attack() {
        super.attack();
    }
}
