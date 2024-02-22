package datily0220;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class quiz1Lambda {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        List<Integer> collect = IntStream.range(1, n)
                .filter(index -> array[index] > array[index - 1])
                .mapToObj(x -> array[x])
                .collect(Collectors.toList());
        answer.addAll(collect);
        return answer;
    }

    public static void main(String[] args) {
        quiz1 quiz1 = new quiz1();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : quiz1.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
