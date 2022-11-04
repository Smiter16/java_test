package Boxes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class BoxApp {
    public static void main(String[] args) {

        Box box1 = new Box(300);
        Box box2 = new Box(400);
        Box box3 = new Box(450);
        Box box4 = new Box(350);
        Box box5 = new Box(450);

        HashSet<Box> boxes = new HashSet<>();

        boxes.add(box1);
        boxes.add(box2);
        boxes.add(box3);
        boxes.add(box4);
        boxes.add(box5);

        System.err.println(boxes.toString());



    }

}
