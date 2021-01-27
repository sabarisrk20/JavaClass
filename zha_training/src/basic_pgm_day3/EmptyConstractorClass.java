package basic_pgm_day3;

import java.util.Scanner;

public class EmptyConstractorClass {
	String stdName, stdID;
	Scanner sc = new Scanner(System.in);

	EmptyConstractorClass() {
		System.out.println("Enter the Student Name and Student ID");
		this.stdName = sc.nextLine();
		this.stdID = sc.next();
	}

	public void Print() {
		System.out.println("the Student Name and Student ID");
		System.out.println("Name: " + this.stdName);
		System.out.println("ID: " + this.stdID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmptyConstractorClass ecc = new EmptyConstractorClass();
		ecc.Print();

	}

}
