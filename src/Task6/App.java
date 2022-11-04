package Task6;

public class App {
    public static void main(String[] args) {
        Human[] humans = new Human[10];

        humans[0] = new Driver ("1");
        humans[1] = new Trainer ("2");
        humans[2] = new Driver ("3");
        humans[3] = new Trainer ("4");
        humans[4] = new Driver ("5");
        humans[5] = new Trainer ("6");
        humans[6] = new Driver ("7");
        humans[7] = new Trainer ("8");
        humans[8] = new Driver ("9");
        humans[9] = new Trainer ("10");

        printHumans(humans);
    }
    public static void printHumans (Human[] humans){
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName());
        }
    }
}
