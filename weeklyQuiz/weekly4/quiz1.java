package weekly4;

import java.util.Scanner;
import java.util.Stack;

public class quiz1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        Stack<Character> stack=new Stack<>();
        boolean result=false;
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(c=='('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    System.out.println(result);
                    return;
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            result=true;
        }
        System.out.println(result);

    }
}
