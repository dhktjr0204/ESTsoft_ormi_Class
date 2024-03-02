package MiddleTest.test2;

import java.util.Scanner;

public class isPrimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try {
            System.out.println(isPrime(n));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static boolean isPrime(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("The number must be between 1 and 100.");
        }
        if (n == 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
