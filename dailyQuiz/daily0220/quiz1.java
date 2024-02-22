package datily0220;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class quiz1 {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();
        answer.add(array[0]);
        for(int i=1;i<n;i++){
            if(array[i]>array[i-1]){
                answer.add(array[i]);
            }
        }

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
