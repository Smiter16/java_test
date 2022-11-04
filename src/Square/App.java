package Square;

import jul18.List;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Square square1 = new Square(121);
        Square square2 = new Square(105);
        Square square3 = new Square(80);
        Square square4 = new Square(110);
        Square square5 = new Square(111);
        Square square6 = new Square(156);
        Square square7 = new Square(256);
        Square square8 = new Square(441);
        Square square9 = new Square(444);
        Square square10 = new Square(512);

        ArrayList<Square> squares = new ArrayList();
        squares.add(square1);
        squares.add(square2);
        squares.add(square3);
        squares.add(square4);
        squares.add(square5);
        squares.add(square6);
        squares.add(square7);
        squares.add(square8);
        squares.add(square9);
        squares.add(square10);


    }

//    public App(ArrayList <Square> squaresList) {
//        for (Square square: squaresList) {
//            boolean flag = true;
//            for (int i = 2; i < square.getA(); i++){
//                if (square.getA() % i == 0){
//                    flag = false;
//                }
//            }
//            if (flag) {
//                System.out.println(square);
//            }
//            return ;
//        }
//    }

    public static ArrayList<Square> findUnique(ArrayList<Square> squares) {
        return squares.stream()
                .filter(square -> square.getA() > 99 && square.getA() < 1000)
                .filter(square -> (square.getA() % 10 != (square.getA() / 10) % 10))
                .collect(Collectors.toList(squares));
    }
}
