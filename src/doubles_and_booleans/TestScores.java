package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What did you get on the test?");
	Double score = Double.parseDouble(test);
	System.out.print(score);

	
	if(score < 60) {
		JOptionPane.showMessageDialog(null,"An F!!! Hit the books before I hit you with one");
	} else if (score < 70) {
		JOptionPane.showMessageDialog(null,"D! STUDY MORE");
	} else if (score < 80) {
		JOptionPane.showMessageDialog(null,"Not bad but I know you can do much better");
	} else if (score < 90) {
		JOptionPane.showMessageDialog(null,"You did great...Keep up the great work!");
	} else if (score < 100) {
		JOptionPane.showMessageDialog(null,"You are the best...keep doing what your doing");
}
}
}
