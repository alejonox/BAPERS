import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    private JPanel loginPanel;
    private JLabel usernameLabel;
    private JTextField usernameTextbox;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JLabel loginLabel;
    private JPasswordField passwordTextbox;

    public LoginPage(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.pack();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // check database to see if there is a username
                // see if the password matches the username
                // send the user to the home page of the system

            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new LoginPage("Login Page");
        frame.setVisible(true);
    }
}
