import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuelCalc {

    private JPanel panel1;
    private JTextField milesVal;
    private JTextField vehichleVal;
    private JRadioButton USDRadioButton;
    private JRadioButton EURRadioButton;
    private JRadioButton GBPRadioButton;
    private JLabel totalCostVal;
    private JButton calculateButton;
    private JTextField fuelPrice;

    public FuelCalc() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String currency = "";
                if (USDRadioButton.isSelected()){
                    currency = "$";
                } else if (EURRadioButton.isSelected()){
                    currency = "€";
                } else if (GBPRadioButton.isSelected()){
                    currency = "£";
                }
                double efficiency = Double.parseDouble(milesVal.getText())/Double.parseDouble(vehichleVal.getText());
                double total = Double.parseDouble(fuelPrice.getText())*efficiency;
                totalCostVal.setText(currency + Double.toString(total));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fuel Calc");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new FuelCalc().panel1);
        frame.setResizable(false);
        frame.pack();

    }

}
