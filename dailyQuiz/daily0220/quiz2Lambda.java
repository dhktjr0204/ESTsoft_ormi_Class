package datily0220;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class quiz2Lambda {
    public int[] solution(int[] array1, int[] array2) {
        // 코드 작성
        int[] result = IntStream
                .concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted().toArray();
        return result;
    }

    public static void main(String[] args) {
        quiz2 ascendingSort = new quiz2();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}