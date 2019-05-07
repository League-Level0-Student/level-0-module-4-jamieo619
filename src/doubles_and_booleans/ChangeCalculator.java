package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int nick = Integer.parseInt(nickels);
		
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dime = Integer.parseInt(dimes);
		
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quart = Integer.parseInt(quarters);
		nick = nick * 5;
		dime = dime * 10;
		quart = quart * 25;
		int sum = nick + dime + quart;
		Double total=Double.valueOf(sum);
		JOptionPane.showMessageDialog(null,total);
		// Convert their answer to an int using Integer.parseInt()

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

