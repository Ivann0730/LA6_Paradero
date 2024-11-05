package LeapYearChecker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JTextField tfYear;
    private JButton btnYear;
    private JPanel pMain;

    LeapYear(){
        btnYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(tfYear.getText().trim());
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    JOptionPane.showMessageDialog(null, "Leap Year");
                }else {
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }
    public static void main(String[] args) {
    LeapYear app = new LeapYear();
    app.setTitle("Leap Year Checker");
    app.setContentPane(app.pMain);
    app.setSize(250,250);
    app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    app.setVisible(true);
    }
}
