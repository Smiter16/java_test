import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test19_08 {
    public static void main(String[] args) {
        String str = "Hola house car";

        Pattern pattern = Pattern.compile("r$");

        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }
}
