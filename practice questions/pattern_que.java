import java.util.Scanner;

public class pattern_que {
    public static void main(String[] args) {
        int n=4;
        int m=5;
        {System.out.println("Enter 1 for half pyramid \n 2 for inverted pyramid \n 3 for solid rectangle \n 4 for hollow rectangle 5 for inverted half pyramid");
    }
        Scanner sc = new Scanner(System.in);
        int pattern =sc.nextInt();

       

        switch (pattern) {
            case 1:
            System.out.println("Half Pyramid");
            for(int i=1; i<=n;i++){
                for(int j=1; j<=i;j++){
                    System.out.print("* ");
            }
            System.out.println();
    }
                
                break;

                case 2:
                {
                    System.out.println("Inverted Pyramid");
                    
                    for(int i=n;i>=1;i--)
               {
                   for(int j=1;j<=i;j++){
                       System.out.print("* ");
       
                   }
                   System.out.println();
       
               }
                }
                break;

                case 3:
                {
                    System.out.println("Solid Rectangle");
                    for(int i=1; i<=n; i++){
                        for (int j = 1; j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }}
                    break;
                    case 4:
                    {
                        System.out.println("Hollow Rectangle");
                        for (int i = 1; i<=n; i++){
                            for (int j = 1; j<=m; j++){
                                if(i==1 || j==1 || i==n || j==m){
                                    System.out.print("* ");
                                }
                                System.out.println();
                        }
                    }
                break;
                    }

                case 5: 
                {
                    System.out.println("Inverted half pyramid");
                    for(int i=1; i<=n; i++){
                        for(int j=1; j<=n-i;j++){
                            System.out.println(" ");
                        }
                        for(int j=1; j<=i;j++){
                            System.out.println("* ");
                    }
                    System.out.println();
                }
                break;


                }
        
        }
}}


