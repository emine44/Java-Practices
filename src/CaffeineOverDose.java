import java.util.Scanner;

public class CaffeineOverDose {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");
        int miliGram = enter.nextInt();
        int cup =  10000/miliGram;
        System.out.println("It would take about " + cup + " drinks for a lethal overdose.");



    }
}
