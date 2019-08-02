import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupon = scan.nextInt();
        int candy = coupon/10;
        int gum = (coupon%10)/3;

        System.out.println("Number of Candies: " + candy);

    }}
