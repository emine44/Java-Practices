package SwitchStatement;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter month number:");
        int num = scan.nextInt();
        String a = "";
        switch(num){
            case 1:
                a="January";
                break;
            case 2:
                a="February";
                break;
            case 3:
                a="March";
                break;
            case 4:
                a="April";
                break;
            case 5:
                a="May";
                break;
            case 6:
                a="June";
                break;

            case 7:
                a="July";
                break;

            case 8:
                a="August";
                break;
            case 9:
                a="September";
                break;
            case 10:
                a="October";
                break;
            case 11:
                a="November";
                break;
            case 12:
                a="December";
                break;
            default:
                a="Invalid number!";

        }
        System.out.println(a);
    }
}
