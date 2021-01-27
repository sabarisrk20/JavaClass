package basic_pgm_day3;

import java.util.*;

public class Bank {

//deposit withdraw balance enquiery
	public int accNo;
	public String accName;
	public int balance, withdraw, deposit;

	public Bank(int accNo, String accName, int withdraw, int deposit, int balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.balance = ( balance + deposit ) - withdraw;
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
			
			System.out.print("Enter the Balance:");
			int balance = sc.nextInt();


			System.out.print("Enter the Deposit:");
			int deposit = sc.nextInt();

			System.out.print("Enter the Withdraw:");
			int withdraw = sc.nextInt();

			if (withdraw > (balance+deposit)) {
				System.out.println("Insufficiant balance");
				bankArr[itr] = new Bank(0, null, 0, 0, 0);
			} else {

				bankArr[itr] = new Bank(accNo, name, withdraw, deposit, balance);
			}
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
