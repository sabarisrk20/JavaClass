package basic_java_pgm_day2;

import java.util.*;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value");
		int row = sc.nextInt();
		System.out.println("Enter the column value");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		System.out.println("Enter the value for the matrix");
		for (int itr1 = 0; itr1 < row; itr1++) {
			for (int itr2 = 0; itr2 < column; itr2++) {
				matrix[itr1][itr2] = sc.nextInt();
			}
		}
		System.out.println("values of the matrix is ");
		for (int itr1 = 0; itr1 < matrix.length; itr1++) {
			for (int itr2 = 0; itr2 < matrix[itr1].length; itr2++) {
				System.out.print(matrix[itr1][itr2] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
