package Insect;

public class Insect {
    private int size;
    private String color;

    public Insect (int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void move () {
        System.out.println("1 insect - move");
    }
    public void attack () {
        System.out.println("2 insect - Attack");
    }
}
