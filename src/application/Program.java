package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			Account acc = new Account(number, holder, balance, 0.0);
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			acc.setWithdrawLimit(withdrawLimit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
			acc.withdraw(withdraw);
			System.out.println("New balance: " + String.format("%.2f", acc.getBalance()));

		} catch (IllegalArgumentException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
	
	
	sc.close();

	}

}
