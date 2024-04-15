import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Morsecodebaum baum = new Morsecodebaum();
        String str = baum.morseCodeDecodieren("..- -. --.. -. ");
        System.out.println(str);
    }
}