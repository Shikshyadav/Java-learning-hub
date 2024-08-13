/**
 * take_input
 */
import java.util.*; // a package whre certain codes are written which will be used in our code 
public class take_input {

    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);   //this function will only work when the above given package is imported
        String name = na.next(); //here next() is a function which can only take one token that is one word 
        //to print the whole line we need to use function nextLine();
    
        String FullNAme = na.nextLine();
        System.out.println(FullNAme);

        System.out.println()  ;

        //nextInt() for integers
        //nextFloat for floating numbers
        //nextDouble for double numbers
        

}
}