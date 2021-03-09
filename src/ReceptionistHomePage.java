import javax.swing.*;

public class ReceptionistHomePage extends JFrame {
    private JPanel receptionistHomePagePanel;
    private JButton createJobButton;
    private JButton takePaymentButton;
    private JMenuBar receptionistHomePageMenuBar;
    private JMenu logoutMenu;

    public ReceptionistHomePage(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(receptionistHomePagePanel);
        this.pack();


    }

    public static void main(String[] args){
        JFrame frame = new ReceptionistHomePage("Office Manager Home Page");
        frame.setVisible(true);
    }

}
