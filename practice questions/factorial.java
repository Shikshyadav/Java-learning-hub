import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
factorial(n);    }

    public static void factorial(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        //loop
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial=factorial*i;

        }
        System.out.println(factorial);
    }
    
}


//withput function
class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        // code here
        if(n<0){
            System.out.println("invalid number");
            return -1;
        }
        int factorial=1;
        for(int i=n; i>=1; i--)
        {
            factorial = factorial*i;
            
        }
        return factorial;
    }
}
