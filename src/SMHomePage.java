import javax.swing.*;

public class SMHomePage extends JFrame {
    private JPanel smHomePagePanel;
    private JButton inspectTasksButton;
    private JButton generateReportButton;
    private JButton takePaymentButton;
    private JButton createJobButton;
    private JButton statusEnquiryButton;
    private JButton viewAJobButton;
    private JMenu logoutMenu;

    public SMHomePage(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(smHomePagePanel);
        this.pack();


    }

    public static void main(String[] args){
        JFrame frame = new SMHomePage("Shift Manager Home Page");
        frame.setVisible(true);
    }
    
}
