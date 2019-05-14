package doubles_and_booleans;

import javax.swing.JOptionPane;

public class PracticeTwo {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null,"This Calculator is used to multiply by 10");
	String number = JOptionPane.showInputDialog("Enter a Number");
	int num = Integer.parseInt(number);
	num = num * 10;
	JOptionPane.showMessageDialog(null,number + " * 10 = " + num);
}
}
