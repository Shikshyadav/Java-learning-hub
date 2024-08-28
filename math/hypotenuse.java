import java.util.Scanner;

public class hypotenuse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter the side x ");
        double x = sc.nextDouble();
        System.out.println("Enter the side y ");
        double y = sc.nextDouble();

        double z;
        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is " + z);
    }

}