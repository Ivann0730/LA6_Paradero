package FoodOrderingSystem;

import javax.swing.*;

public class FOSystem extends JFrame {
    private JCheckBox friesCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox pizzaCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JPanel pMain;

    FOSystem(){

    }
    public static void main(String[] args) {
        FOSystem app = new FOSystem();
        app.setTitle("Food Ordering System");
        app.setSize(400, 750);
        app.setContentPane(app.pMain);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}


