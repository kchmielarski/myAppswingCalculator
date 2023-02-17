import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myAppswing1 {
    private JPanel mainPanel;
    private JTextField textResult;
    private JTextField textNumber1;
    private JLabel labell1;
    private JTextField textNumber2;
    private JLabel labell2;
    private JLabel labelResult;
    private JButton buttomadd;
    private JButton buttonReset;
    private JButton buttonSubsract;
    private JButton ButtonDivide;
    private JButton buttonMultiply;
    private JButton buttonRoot;
    private JLabel appName;
    private JButton buttonadd;

    public myAppswing1() {
        buttomadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wynik = Integer.parseInt(textNumber1.getText()) + Integer.parseInt(textNumber2.getText());
                textResult.setText(Integer.toString(wynik));}
        });
        buttonSubsract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int wynik = Integer.parseInt(textNumber1.getText()) - Integer.parseInt(textNumber2.getText());
                textResult.setText(Integer.toString(wynik)); }
        });

        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textNumber1.setText("");
                textNumber2.setText("");
                textResult.setText("");
            }
        });

        ButtonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
               double wynik = Double.parseDouble(textNumber1.getText()) / Double.parseDouble(textNumber2.getText());
               textResult.setText(Double.toString(wynik));
            }
                catch (NumberFormatException t){
                    textResult.setText("Błędny format liczby");
                }
            }
        });
        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                float wynik = Float.parseFloat(textNumber1.getText()) * Float.parseFloat(textNumber2.getText());
                textResult.setText(Float.toString(wynik));
            }
                catch (NumberFormatException s) {
                    textResult.setText("Błędny format liczby");
                }
            }
        });
        buttonRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                double x = Double.parseDouble(textNumber1.getText());
                double y = Double.parseDouble(textNumber2.getText());
                double wynik = Math.pow(x,y);
                textResult.setText(Double.toString(wynik));
            }
                catch (NumberFormatException w) {
                    textResult.setText("Błędny format liczby");
                }

                 }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("myAppswing1");
        frame.setContentPane(new myAppswing1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
