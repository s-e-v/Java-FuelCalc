import javax.swing.*;

public class FuelCalc {

    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JRadioButton USDRadioButton;
    private JRadioButton EURRadioButton;
    private JRadioButton GBPRadioButton;
    private JLabel totalCostVal;
    private JButton calculateButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fuel Calc");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new FuelCalc().panel1);
        frame.setResizable(false);
        frame.pack();

    }

}
