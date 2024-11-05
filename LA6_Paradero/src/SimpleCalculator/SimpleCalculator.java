package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JButton btnCompute;
    private JPanel pMain;
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JLabel lblResult;

    SimpleCalculator(){

        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int first  = Integer.parseInt(tfNumber1.getText().trim());
            int second = Integer.parseInt(tfNumber2.getText().trim());
            int result = 0;
            switch (cbOperations.getSelectedIndex()) {
                    case 0: // Addition
                        result = first + second;
                        break;
                    case 1: // Subtraction
                        result = first - second;
                        break;
                    case 2: // Division
                        if (second != 0) {
                            result = first / second;
                        } else {
                            JOptionPane.showMessageDialog(null, "Cannot divide by zero");
                            return;
                        }
                        break;
                    case 3: // Multiplication
                        result = first * second;
                        break;
                }
                lblResult.setText(String.valueOf(result));
        }
    });
}

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.pMain);
        app.setSize(600, 250);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
