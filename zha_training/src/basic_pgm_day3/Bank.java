package basic_pgm_day3;

import java.util.*;

public class Bank {

//deposit withdraw balance enquiery
	public int accNo;
	public String accName;
	public int balance, withdraw, deposit;

	public Bank(int accNo, String accName, int withdraw, int deposit) {
		this.accNo = accNo;
		this.accName = accName;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.balance = deposit - withdraw;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users");
		int number = sc.nextInt();
		Bank bankArr[] = new Bank[number];
		for (int itr = 0; itr < number; itr++) {

			System.out.print("Enter the Customer name:");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Enter the Customer Acc no:");
			int accNo = sc.nextInt();

			System.out.print("Enter the Deposit:");
			int deposit = sc.nextInt();

			System.out.print("Enter the withdraw:");
			int withdraw = sc.nextInt();

			bankArr[itr] = new Bank(accNo, name, withdraw, deposit);
		}
		System.out.printf("%10s %20s %20s %20s %20s", "AccNo", "Name", "Deposit", "Withdraw", "Balance");
		System.out.println();
		for (int itr = 0; itr < number; itr++) {
			System.out.printf("%10s %20s %20s %20s %20s", bankArr[itr].accNo, bankArr[itr].accName,
					bankArr[itr].deposit, bankArr[itr].withdraw, bankArr[itr].balance);
			System.out.println();
		}

	}

}
