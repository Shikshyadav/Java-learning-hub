import java.util.*;

public class functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize the Scanner object
        System.out.println("Enter your name:");
        String name = sc.next(); // Read user input and assign it to 'name'
        printName(name); // Pass 'name' to the printName function

        sum();
    }

    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void sum(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter num 2: ");
        int num2= sc.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
        return;

    }
}
  