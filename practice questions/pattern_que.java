import java.util.Scanner;

public class pattern_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            int n = 4;
            int m = 5;
            System.out.println("Enter 1 for half pyramid \n" +
                   "2 for inverted pyramid \n" +
                   "3 for solid rectangle \n" +
                   "4 for hollow rectangle \n" +
                   "5 for inverted half pyramid \n"+
                   "6 for numbered half pyramid \n"+
                   "7 for numbered inverted half pyramid \n"+
                   "8 for floyd's triangle \n"+
                   "9 for 0-1 triangle");

//                    StringBuilder sb = new StringBuilder();
// sb.append("Enter 1 for half pyramid \n");
// sb.append("2 for inverted pyramid \n");
// sb.append("3 for solid rectangle \n");
// sb.append("4 for hollow rectangle \n");
// sb.append("5 for inverted half pyramid");
// System.out.println(sb.toString());


            int pattern = sc.nextInt();

            switch (pattern) {
                case 1:

                    System.out.println("Half Pyramid");
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("Inverted Pyramid");
                    for (int i = n; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Solid Rectangle");
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= m; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

               case 4:
                    System.out.println("Hollow Rectangle");
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= m; j++) {
                            if (i == 1 || j == 1 || i == n || j == m) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Inverted half pyramid");
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                    case 6:
                    System.out.println("half pyramid number pattern");
                    for(int i =1; i<=n;i++)
                    {
                        for(int j=1; j<=i;j++)
                        {
                            System.out.print(j+" ");

                        }
                        System.out.println();
                    }
                    break;

                     case 7:
                    System.out.println("inverted pyramid with number");
                    for(int i =1;i<=n;i++){
                        for(int j = 1; j<=n-i+1;j++){
                            System.out.print(j+" ");
                        }
                        System.out.println();
                    }
                break;

                case 8:
                System.out.println("floyds traingle");
                int number = 1;
                for (int i=1;i<=n;i++)
                {
                    for(int j =1;j<=i;j++)
                    {
                        System.out.print(number +" ");
                        number++; //to increase the value of the number
                    

                    }
                    System.out.println();

                }
                break;
                case 9:
                System.out.println("0-1 triangle");
                for(int i=1;i<=n;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        int sum = i+j;
                        if(sum % 2==0){
                            System.out.print("1 ");
                        }
                        else{
                            System.out.print("0 ");
                        }
                        
                    }
                    System.out.println();
                }
                break;
                default:
                    System.out.println("Invalid choice");
            }

            System.out.println("Do you want to continue? (1 for yes, 0 for no)");
            choice = sc.nextInt();
        } while (choice == 1);
    }
}