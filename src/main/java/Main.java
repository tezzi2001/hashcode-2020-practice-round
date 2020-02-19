import io.input.InputManager;

import static algorithm.Algorithm.perform;
import static io.output.Printer.print;

public class Main {
    private static String[] names = new String[] {"b_small", "c_medium", "d_quite_big", "e_also_big"};
    public static void main (String[] args) {
        for (String name: names) {
            print(perform(new InputManager(name + ".in").scan()), name + ".out");
        }
    }
}
