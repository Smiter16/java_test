package Task7;

public class App {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];

        animals[0] = new Cat ("1 voice");
        animals[1] = new Dog ("2 voice");
        animals[2] = new Cow ("3 voice");
        animals[3] = new Animal ("4 voice");


        printAnimals (animals);

    }

    private static void printAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getVoice());
        }
    }
}
