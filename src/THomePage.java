import javax.swing.*;

public class THomePage extends JFrame {
    private JPanel tHomePagePanel;
    private JButton statusEnquiryButton;
    private JButton processTaskButton;
    private JButton inspectTasksButton;
    private JMenuBar tHomePageMenuBar;
    private JMenu logoutMenu;

    public THomePage(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(tHomePagePanel);
        this.pack();


    }

    public static void main(String[] args){
        JFrame frame = new THomePage("Technician Home Page");
        frame.setVisible(true);
    }

}
