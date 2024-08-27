import java.util.Scanner;

public class even {  // Ensure the class name matches the file name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        evenOrNot(n);
    }

    public static void evenOrNot(int n) {
        if (n % 2 == 0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is not even");
        }
    }
}
