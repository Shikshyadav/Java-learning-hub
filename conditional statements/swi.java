import java.util.*;


class swi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        switch(num)
        {
            case 1:{

            
            System.out.println("monday");
            break;
            }

            case 2: {
                System.out.println("tuesday");
                break;

            }
            case 3:{
                System.out.println("wednesday");
                break;
            }
            default:
            System.out.println("enter  a valid number");
        }
        

    }
}