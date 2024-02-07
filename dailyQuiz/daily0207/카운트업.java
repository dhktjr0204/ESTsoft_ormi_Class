package daily0207;

import java.util.Arrays;

public class 카운트업 {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        for(int i=0;i<end_num-start_num+1;i++){
            answer[i]=start_num+i;
        }
        return answer;
    }

    public static void main(String[] args) {
        카운트업 countUp = new 카운트업();
        System.out.println(Arrays.toString(countUp.solution(3, 10)));
    }
}
