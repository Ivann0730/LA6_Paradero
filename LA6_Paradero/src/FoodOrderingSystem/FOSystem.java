package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FOSystem extends JFrame {
    private JCheckBox cFries;
    private JCheckBox cBurger;
    private JCheckBox cPizza;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JPanel pMain;
    private JButton btnOrder;

    // Arrays for food items and their prices
    private final JCheckBox[] fd = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
    private final int[] price = {100, 80, 65, 55, 50, 40};
    // Arrays for discount radio buttons and values
    private final JRadioButton[] dsc = {rbNone, rb5, rb10, rb15};
    private final double[] val = {0.0, 0.05, 0.1, 0.15};

    FOSystem() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total =0;
                for(int i=0; i<6; i++){
                    if(fd[i].isSelected()){
                        total += price[i];
                    }
                }
                if(rbNone.isSelected()){
                    String sumofAll = String.format("%.2f", total);
                    JOptionPane.showMessageDialog(null,"The total price is Php" + sumofAll);
                }else{
                    for(int i=1; i<4;i++){
                        if(dsc[i].isSelected()){
                            double d = total * val[i];
                            total -= d;
                            String c = String.format("%.2f", total);
                            JOptionPane.showMessageDialog(null,"The total price is Php " + c);
                            break;
                        }
                    }
                }
            }
        });
    }


    public static void main(String[] args) {
        FOSystem app = new FOSystem();
        app.setTitle("Food Ordering System");
        app.setSize(500, 350);
        app.setContentPane(app.pMain);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
