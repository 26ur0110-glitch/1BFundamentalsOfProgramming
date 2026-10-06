package DecisionControlStructureAss2;

import javax.swing.JOptionPane;

public class DCSTHREE {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter hourly pay rate: ");
        double rate = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter hours worked: ");
        double hours = Double.parseDouble(input);
        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }
        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        JOptionPane.showMessageDialog(null,
                "Gross Pay: " + grossPay +
                        "/n Withholding Tax: " + withholdingTax +
                        "/n Net Pay: " + netPay);
    }
}
