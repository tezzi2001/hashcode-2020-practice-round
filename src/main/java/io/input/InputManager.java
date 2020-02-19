package io.input;

import lombok.AllArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@AllArgsConstructor
public class InputManager {
    private String name;

    public InputData scan()  {
        try (Scanner scanner = new Scanner(new File(InputData.class.getProtectionDomain().getClassLoader().getResource(name).getFile()))) {
            int m, n;
            int[] array;
            m = scanner.nextInt();
            n = scanner.nextInt();
            array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            return new InputData(array, m);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

