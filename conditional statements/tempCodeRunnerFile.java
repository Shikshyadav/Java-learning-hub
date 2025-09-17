import java.util.Scanner;

class updated_swi{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();

         switch(s)
         {
            case "monday", "tuesday" -> System.out.println("6am");

            case "wednesday" -> System.out.println("8am");

            default -> System.out.println("sleep");
         }
    }
}