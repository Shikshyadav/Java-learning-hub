import java.util.*;

public class shopping_cart {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        double total_Price;
        char currency = '$';

        System.out.print("What item would you like to buy? " );
        item = sc.nextLine();

        System.out.println("What is the cost of each item? ");
        price = sc.nextDouble();

        System.out.println("how many would you like? ");
        quantity = sc.nextInt();

        total_Price = quantity*price;

        System.out.println("You have bought "+ quantity +" " +item);
        System.out.println("Your total payable amount is  " +currency+ total_Price);
    } 

}
