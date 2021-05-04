import javax.swing.*;

public class ChatGUI {
    private JButton host;
    private JButton connect;
    private JButton send;
    private JTextArea console;
    private JTextArea message;
    private JTextArea ip;
    private JTextArea port;
    private JPanel panel1;

    public static void main(String[] args) {
        JFrame frame = new JFrame ("ChatGUI");
        frame.setContentPane(new ChatGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
