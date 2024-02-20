package daily0219;

import java.util.function.IntBinaryOperator;

public class quiz5 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(Math::max);
        int max1 = maxOrMin(
                //매개변수 두개를 받아서 최댓값을 리턴하는 람다식
//                (a, b) -> a >= b ? a : b
//                위에 로직은 Math.max로직과 동일하다.
//                (a,b)->Math.max(a,b);
                Math::max
        );
        int min2 = maxOrMin(
                //매개변수 두개를 받아서 최소값을 리턴하는 람다식
//                (a, b) -> a < b ? a : b
//                위에 로직은 Math.min로직과 동일하다.
//                (a,b)->Math.min(a,b);
                Math::min
        );
        System.out.println("최대값 : " + max);

        int min = maxOrMin(Math::min);
        System.out.println("최소값: " + min);
    }
}
