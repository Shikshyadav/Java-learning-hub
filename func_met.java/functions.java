import java.util.*;

public class functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize the Scanner object
        System.out.println("Enter your name:");
        String name = sc.next(); // Read user input and assign it to 'name'
        printName(name); // Pass 'name' to the printName function

        sum();
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();


      //  System.out.println(calculateSum(a, b));
        System.out.println("the product of two numbers are "+ product(a, b));
        
        String message = greeting();
        System.out.println(message);

        int n = sc.nextInt();
        printSum(n);

        System.out.println(getGreater(a, b));
         
        Double r = sc.nextDouble();
        System.out.println(getCircumference(radius));
         
    }   
 
    }

    public static void printName(String name) {
        System.out.println(name);
        return;   //return means finishing the function -->function over
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

    public static int calculateSum(int a, int b){   // function with integer return type
        int sum = a+b;    
      return sum;
      
}

public static int product(int a, int b){
    return a*b;
}
// string return type
public static String greeting(){
    String greet= "How are you";
    return greet;
}
public static void printSum(int n) {
    int sum = 0;


   for(int i=1; i<=n; i++) {
     if(i % 2 != 0) {
         sum = sum + i;
     }
   }


   System.out.println(sum);
}
 public static int getGreater(int a, int b) {
      if(a > b) {
          return a;
      } else {
          return b;
      }
      public static Double getCircumference(Double radius) {
        return 2 * 3.14 * radius;
    }
    public static boolean isElligible(int age) {
        if(age > 18) {
            return true;
        }
        return false;
    }
        
   }


  