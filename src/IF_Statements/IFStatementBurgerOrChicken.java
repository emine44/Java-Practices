package IF_Statements;

import java.util.Scanner;

public class IFStatementBurgerOrChicken {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String in = s.next();
        String b = "burger";
        String c = "chicken";
        String a = "soda";

        if(in.equals(c) || in.equals(b) )
        {
            System.out.println("10.0");
        }
        if(in.equals(a))
        {
            System.out.println("2.0");
        }





    }
}
