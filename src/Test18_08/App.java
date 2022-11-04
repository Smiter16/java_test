package Test18_08;

import java.io.*;

public class App {
    public static void main(String[] args) throws IOException {

        User user = new User("Adam", "Smith", 40);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("INPUT.TXT0"))){
            objectOutputStream.writeObject(user);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(user);
    }
}
