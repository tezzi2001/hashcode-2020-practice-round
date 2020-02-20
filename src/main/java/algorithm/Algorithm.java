package algorithm;

import io.input.InputData;
import io.output.OutputForm;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Algorithm {
    public OutputForm perform(InputData inputData) {
        int[] inputArray = inputData.getArray();
        int sum = 0;
        int maxSum = 0;
        int i;
        for (i = 0; i < inputArray.length;  i++) {
            sum += inputArray[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum > inputData.getMax()) {
                System.out.println(sum-inputArray[i]);
                int[] array = new int [i];
                for (int j = 0; j < i; j++) {
                    array[j] = inputArray[j];
                }
                return new OutputForm(array);
            }
        }
        return new OutputForm(inputArray);
    }
}
