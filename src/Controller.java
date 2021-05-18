import javax.swing.*;

public class Controller extends ChatGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame ("ChatGUI");
        frame.setContentPane(new ChatGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }

}
