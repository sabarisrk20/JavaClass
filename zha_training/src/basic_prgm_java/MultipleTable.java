package basic_prgm_java;

//4.Multiplication table input Starting ,ending and which is the table.
import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = 0, end = 0, table;
		System.out.println("Enter the start value");
		start = scan.nextInt();
		System.out.println("Enter the end value");
		end = scan.nextInt();
		System.out.println("Enter the table value");
		table = scan.nextInt();
		/*
		System.out.println("Using For loop");
		for (; start <= end; start++) {
			System.out.println(start + " * " + table + " = " + start * table);
		}
		
		System.out.println("Using While loop");
		while (start <= end) {
			System.out.println(start + " * " + table + " = " + start * table);
			start++;
		}
		*/
		System.out.println("Using do While loop");
		do {
			System.out.println(start + " * " + table + " = " + start * table);
			start++;
		}while (start <= end);
		scan.close();
	}

}