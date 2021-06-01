import javax.swing.*;


//This is the controller class that runs the program


public class Controller extends ChatGUI {

    public static String bonk;

    public static void main(String[] args) {
        bonk = JOptionPane.showInputDialog(null, "Namn?");
        JFrame frame = new JFrame ("ChatGUI");
        frame.setContentPane(new ChatGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }

}
