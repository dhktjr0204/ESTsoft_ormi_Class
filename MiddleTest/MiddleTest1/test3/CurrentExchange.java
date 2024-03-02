package MiddleTest.test3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrentExchange {
    public static final BigDecimal USD=BigDecimal.valueOf(1331.50);
    public static final BigDecimal JPY=BigDecimal.valueOf(884.75);

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("원 (KRW) = ");
        BigDecimal WON=sc.nextBigDecimal();

        if(WON.compareTo(BigDecimal.ZERO)<0){
            throw new IllegalArgumentException("금액은 음수일 수 없습니다.");
        }
        BigDecimal changeUSD=WON.divide(USD, 3, RoundingMode.HALF_EVEN);
        BigDecimal changeJPY=WON.divide(JPY, 5, RoundingMode.HALF_EVEN).multiply(BigDecimal.valueOf(100));

        DecimalFormat decimalFormat=new DecimalFormat("0.00");
        System.out.println("달러($) = "+decimalFormat.format(changeUSD)+" / JPY = "+decimalFormat.format(changeJPY));
    }
}
