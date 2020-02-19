package io.output;

import lombok.experimental.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

@UtilityClass
public class Printer {
    public void print(OutputForm form, String fileName) {
        File file = new File("src/main/resources/" + fileName + ".out");

        try(PrintWriter writer = new PrintWriter(file)) {
            writer.print(form.getTypesOfPizza().length);
            writer.print(System.lineSeparator());
            writer.print(form);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
