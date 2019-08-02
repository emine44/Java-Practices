package IF_Statements;

import java.util.Scanner;

public class HappyValleySchoolSystem {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = scan.nextInt();

        if (age==2){System.out.println("toddler");}
        if (age>2 && age<6){System.out.println("early childhood");}
        if (age>5 && age<8){System.out.println("young reader");}
        if (age>7 && age<11){System.out.println("elementary");}
        if (age>10 && age<13){System.out.println("middle");}
        if (age==13){System.out.println("impossible");}
        if (age>13 && age<17){System.out.println("high school");}
        if (age>16 && age<19){System.out.println("scholar");}
        if (age<2){System.out.println("ineligible");}
        if (age>18){System.out.println("ineligible");}



    }
}
