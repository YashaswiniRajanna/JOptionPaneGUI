import javax.swing.JOptionPane;

public class myfirstgui{
public static void main(String[] args) {
    
    String name=JOptionPane.showInputDialog("enter your name");
    JOptionPane.showMessageDialog(null,"hello" +name);

    int age= Integer.parseInt(JOptionPane.showInputDialog(null,"enter your age"));
    JOptionPane.showMessageDialog(null, "yoe are is "+age+" years old");

    double salary= Double.parseDouble(JOptionPane.showInputDialog(null,"enter your salary:"));
    JOptionPane.showMessageDialog(null, "your salary  is "+salary+"");

}
}
    

