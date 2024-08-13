// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.

import java.util.Scanner;

class swi_que{
    public static void main(String[] args) {
        {
            System.out.println("Enter the value of num and num 2");
        }
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int num2 = sc.nextInt();
        

    
      {  System.out.println("enter 1 for addition \n 2 for substraction \n 3 for multiplicaton");
    }
    int operators = sc.nextInt();
        switch (operators) {
            case 1 -> System.out.println(num+num2);
            // System.out.println(num+num2);
            // break;

            case 2 -> System.out.println(num-num2);
            // System.out.println(num-num2);
            // break;

            case 3 -> System.out.println(num*num2);
            // System.out.println(num*num2);
            // break;

            case 4-> System.out.println(num/num2);
            // System.out.println(num/num2);
            // break;

            case 5 -> System.out.println(num%num2);
            // System.out.println(num%num2);
            // break;

            default ->System.out.println("Invalid operator");
        }
}
}