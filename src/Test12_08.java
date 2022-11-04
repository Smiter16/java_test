import java.io.*;

public class Test12_08 {
    public static void main(String[] args) throws IOException {

        File testFile = new File("C://Users/Zmi/Desktop/test.txt");

        FileOutputStream filetest = new FileOutputStream(testFile);

        String str = "Hello Java";

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++){
            filetest.write(chars[i]);
        }


        FileReader fileInputStream = new FileReader(testFile);

        int b = 0;


        while ((b = fileInputStream.read()) != -1) {
            System.out.print((char)b);
        }
        fileInputStream.close();

    }
}
