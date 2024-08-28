import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random num = new Random();
        
        int x = num.nextInt(6)+1; //to limit the value we keep the number in the bracket 
        // adding 1 because the pc takes the number from 0 to 6 so for a dice adding 1 will exclude 0
        double y = num.nextDouble();
        boolean z = num.nextBoolean();
        float a = num.nextFloat();
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);

        System.out.println(x);
    }
}
