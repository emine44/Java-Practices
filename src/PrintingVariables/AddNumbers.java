package PrintingVariables;

import java.util.Scanner;

public class AddNumbers {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE:
            Scanner scan = new Scanner(System.in);
            int num1  = scan.nextInt();
            int num2  = scan.nextInt();
            int num3  = scan.nextInt();
            System.out.println("Enter 3 numbers:");
            int sum = num1 + num2 + num3 ;
            System.out.println("Sum of numbers: " + sum);




        }
}
