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
    public JLabel portlabel;
    public JLabel iplabel;

    public ChatGUI() {
        host.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                console.setText("Server started");

            }
        });

        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = message.getText();
                console.append("\n" + msg);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
