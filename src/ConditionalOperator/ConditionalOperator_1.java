package ConditionalOperator;

import java.util.Scanner;

public class ConditionalOperator_1 {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        int result;
        result=  (x>=5)?  (x<5)? 5:x:-x;
        System.out.println(result);

    }
}
