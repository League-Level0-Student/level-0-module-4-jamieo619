package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What did you get on the test?");
	Double score = Double.parseDouble(test);
	System.out.print(score);

	
	if(score <= 59) {
		JOptionPane.showMessageDialog(null,"You are the best...Keep up the great work!!!");
	} else if (score <= 69) {
		JOptionPane.showMessageDialog(null,"You need to study more next time");
	} else if (score <= 79) {
		JOptionPane.showMessageDialog(null,"Not bad but I know you can do much better");
	} else if (score <= 89) {
		JOptionPane.showMessageDialog(null,"You did great...Keep up the great work!");
	} else if (score <= 100) {
		JOptionPane.showMessageDialog(null,"This is not good...Hit the books starting now");
}
}
}
