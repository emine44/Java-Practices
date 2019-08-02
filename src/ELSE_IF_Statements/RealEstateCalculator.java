package ELSE_IF_Statements;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        String a = "Single Family Home";
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");

        System.out.println("Enter your property type:");
        houseType = scan.nextLine();
        if(houseType.equals("Condo")){
            propertyPrice = 50000;}
        if(houseType.equals("Townhouse")){
            propertyPrice = 67000;}
        if(houseType.equals(a)){
            propertyPrice = 100000;}

        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice += 30000*numberOfBedrooms;

        System.out.println("Do you have a backyard?");
        backyard=scan.nextBoolean();
        if(backyard==true){
            if (houseType.equals("Townhouse")){ propertyPrice += 5000;}
            if (houseType.equals("a")){
                propertyPrice += 5000;}
            if(houseType.equals("Condo")){
                System.out.println("Backyard is not available for condo!");
            }

        }




        System.out.println("Do you have garage?");
        garage=scan.nextBoolean();
        if(garage==true){
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if(garageSpots<10){
                propertyPrice= 20000*garageSpots + propertyPrice;}
            else{System.out.println("Pardon, it's not a public parking!");}}

        System.out.println("How close is metro station?");
        metroAccessibility=scan.nextFloat();
        if(metroAccessibility<=1){
            propertyPrice = 10000 + propertyPrice; }
        if(metroAccessibility>1 && metroAccessibility<3){
            propertyPrice  = 5000 + propertyPrice;}

        System.out.println("How close is highway?");
        highwayAccessibility=scan.nextFloat();
        if(highwayAccessibility<=1){
            propertyPrice = 15000 + propertyPrice; }
        if(highwayAccessibility>1 && metroAccessibility<5){
            propertyPrice = propertyPrice + 8000;}
        if(highwayAccessibility>5 && metroAccessibility<21){
            propertyPrice = propertyPrice+ 4000;}

        System.out.println("What's the rating of nearest school?");
        schoolScore=scan.nextInt();
        if(schoolScore>8 && schoolScore<11){
            propertyPrice = propertyPrice +45000;}
        else if(schoolScore>3 && schoolScore<8){
            propertyPrice = propertyPrice + 20000;}
        else{ propertyPrice  =propertyPrice + 5000;}

        System.out.println("Does any of your family members smoking?");
        smoking=scan.nextBoolean();
        if(smoking==true){
            propertyPrice = propertyPrice - 5000;
        }

        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");



}}