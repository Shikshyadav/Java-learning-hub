import java.util.*;

public class substring {
    public static void main(String[] args) {
        String email = "shkikshayaav92@gmail.com";
        String username = email.substring(0,6);
        String domain = email.substring(9);

        System.out.println(username);
        System.out.println(domain);

    }
    
}
