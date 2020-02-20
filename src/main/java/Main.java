import algorithm.Algorithm;
import io.input.InputManager;
import io.output.Printer;

public class Main {
    private static String[] names = new String[] {"b_small", "c_medium", "d_quite_big", "e_also_big"};
    public static void main (String[] args) {
        for (String name: names) {
            Printer.print(Algorithm.perform(new InputManager(name + ".in").scan()), name + ".out");
        }
    }
}
