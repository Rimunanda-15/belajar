package Java;
import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 1, 4 };
        int[] sorted = sort(numbers);
        System.out.println("Array terurut: " + Arrays.toString(sorted));
    }

    public static int[] sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }

}
