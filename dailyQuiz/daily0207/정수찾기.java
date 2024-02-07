package daily0207;

public class 정수찾기 {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        for(int num:num_list){
            if(num==n){
                answer=1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        정수찾기 findNum = new 정수찾기();
        System.out.println(findNum.solution(new int[]{1,2,3,4,5},3));
    }
}
