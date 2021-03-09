import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OMHomePage extends JFrame {
    private JPanel omHomePagePanel;
    private JButton backupDatabaseButton;
    private JButton statusEnquiryButton;
    private JButton editRemoveTaskButton;
    private JButton inspectTasksButton;
    private JButton generateReportButton;
    private JButton processTaskButton;
    private JButton takePaymentButton;
    private JButton createJobButton;
    private JButton createCustomerAccountButton;
    private JButton manageStandardTaskButton;
    private JButton addNewTaskButton;
    private JButton manageCustomerAccountButton;
    private JButton restoreDatabaseButton;
    private JMenu logoutMenu;
    private JMenuBar OMHomePageMenuBar;

    public OMHomePage(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(omHomePagePanel);
        this.pack();


    }

    public static void main(String[] args){
        JFrame frame = new OMHomePage("Office Manager Home Page");
        frame.setVisible(true);
    }

}
