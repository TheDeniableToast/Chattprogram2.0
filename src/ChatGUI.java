import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatGUI {
    public JButton host;
    public JButton connect;
    public JButton send;
    public JTextArea console;
    public JTextArea message;
    public JPanel panel1;
    public JTextField ipfield;
    public JTextField portfield;
    public JTextField namefield;

    public ChatGUI() {
        host.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
