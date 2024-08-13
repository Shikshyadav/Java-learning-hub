import java.util.Scanner;

class ternary{
    public static void main(String[] args) {
        //int n = 8;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        // if(n%2==0)
        // {
        //     result = 10;
        //     System.out.println(result);

        // }
        // else{
        //     result= 20;
        //     System.out.println(result);
        // }

        // all this can be written in one line

        result = n%2==0 ? 10 : 20;
        //this means if the value n is even print 10 or else 20 
        System.out.println(result);
    }
}