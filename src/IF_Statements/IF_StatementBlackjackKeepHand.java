package IF_Statements;

import java.util.Scanner;

public class IF_StatementBlackjackKeepHand {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int house = s.nextInt();
        int player = s.nextInt();

        if(house<player)
        {
            System.out.println("player wins");
        }
        if(house>player)
        {
            System.out.println("player loss");
        }
        if(house==player)
        {
            System.out.println("its a tie");
        }
        if((house+player)/2 > 21)
        {
            System.out.println("bust");
        }
    }
}
