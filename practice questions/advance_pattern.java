import java.util.Scanner;

public class advance_pattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int choice;
        do{
            int n = 4;
            int m =5;

            int pattern = sc.nextInt();

            switch(pattern){
                case 1:
                for(int i=1; i<=n; i++) {
                    for(int j=1; j<=i; j++) {
                        System.out.print("*");
                    }
         
         
                    int spaces = 2 * (n-i);
                    for(int j=1; j<=spaces; j++) {
                        System.out.print(" ");
                    }
         
         
                    for(int j=1; j<=i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

                case 2:
                for(int i=n; i>=1; i--) {
                    for(int j=1; j<=i; j++) {
                        System.out.print("*");
                    }
         
         
                    int spaces = 2 * (n-i);
                    for(int j=1; j<=spaces; j++) {
                        System.out.print(" ");
                    }
         
         
                    for(int j=1; j<=i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                System.out.println("Do you want to contiue? 1==yes; 0==no");
                choice = sc.nextInt();
            }   
            
         }
         
         while(choice==1);
         
         
            }
        
    }
}
