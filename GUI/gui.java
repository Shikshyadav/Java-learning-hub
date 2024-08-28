import javax.swing.JOptionPane;

public class gui {
    public static void main(String[] args) {
    //  to create a dialogue box
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello " + name);

        // converting string to integer
        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + "years old") ;

        // when using the dialogue box it returns string data type that is why it must be converted to the data type we want

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "Your height is " + height + "feet") ;


       
     }
}
