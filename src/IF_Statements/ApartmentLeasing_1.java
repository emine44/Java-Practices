package IF_Statements;

import java.util.Scanner;

public class ApartmentLeasing_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice=0;

        if(numberOfBedrooms == 1){
            System.out.println("One Bedroom Selected");
            System.out.println("Starting Price: " + (startingPrice=1100) );
        }
        if(numberOfBedrooms == 2){
            System.out.println("Two Bedroom Selected");
            System.out.println("Starting Price: " + (startingPrice=1850) );
        }
        if(numberOfBedrooms == 3){
            System.out.println("Three Bedroom Selected");
            System.out.println("Starting Price: " + (startingPrice=2550) );
        }

        if(numberOfBedrooms !=1 && numberOfBedrooms!=2 && numberOfBedrooms!=3){
            System.out.println("No such Bedrooms available");
            System.out.println("Starting Price: " + startingPrice);
        }


    }
}
