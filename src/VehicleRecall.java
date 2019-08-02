import java.util.Scanner;

public class VehicleRecall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = scan.nextInt();
        if((vehicleYear>1994 && vehicleYear<1999) ||
                (vehicleYear>2000 && vehicleYear<2003) ||
                (vehicleYear>2003 && vehicleYear<2007) ||
                (vehicleYear>2014 && vehicleYear<2018)){
            System.out.println("Your vehicle needs to be recalled!");


        }
        else{
            System.out.println("Your vehicle is fine, enjoy!");
        }

    }
}
