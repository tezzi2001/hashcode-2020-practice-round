package io.input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class InputData {
    static int m;
    static int n;
    static int[] array;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File(InputData.class.getProtectionDomain().getClassLoader().getResource("File").getFile()))) {
            m = scanner.nextInt();
            System.out.println("M=" + m);
            n = scanner.nextInt();
            System.out.println("N=" + n);
            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
