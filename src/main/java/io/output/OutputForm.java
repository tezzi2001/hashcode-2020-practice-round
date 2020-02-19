package io.output;

import lombok.AllArgsConstructor;
import lombok.Data;

import static java.util.Arrays.stream;

@Data
@AllArgsConstructor
public class OutputForm {
    private int[] typesOfPizza;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stream(typesOfPizza).forEach(type -> stringBuilder.append(type).append(" "));
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }

    public int length() {
        return typesOfPizza.length;
    }
}
