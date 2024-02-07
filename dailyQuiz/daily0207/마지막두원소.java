package daily0207;

import java.util.Arrays;

public class 마지막두원소 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for(int i=0;i<num_list.length+1;i++){
            if(i==num_list.length){
                if (num_list[i-1]>num_list[i-2]){
                    answer[i]=num_list[i-1]-num_list[i-2];
                }else{
                    answer[i]=num_list[i-1]*2;
                }
            }else {
                answer[i] = num_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        마지막두원소 lastTwoNum = new 마지막두원소();
        System.out.println(Arrays.toString(lastTwoNum.solution(new int[]{2, 1, 6})));
    }
}
