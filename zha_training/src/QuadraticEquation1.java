import java.util.Scanner;

public class QuadraticEquation1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value a:");
		int num1 = scan.nextInt();
		System.out.println("Enter the value b:");
		int num2 = scan.nextInt();
		System.out.println("Enter the value c:");
		int num3 = scan.nextInt();

		int deter = (int)(num2 * num2 - 4 * num1 * num3);
		int root1, root2;
		
		System.out.println("\nUsing else..if");
		if (deter > 0) {
			root1 = (int) ((-num2 + Math.sqrt(deter)) / (2 * num1));
			root2 = (int) ((-num2 - Math.sqrt(deter)) / (2 * num1));
			System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
		} else if (deter == 0) {
			root1 = root2 = -num2 / (2 * num1);
			System.out.printf("root1 = root2 = %.2f;", root1);
		} else {
			double real = -num2 / (2 * num1);
			double imaginary = Math.sqrt(-deter) / (2 * num1);
			System.out.printf("root1 = %.2f+%.2fi", real, imaginary);
			System.out.printf("\nroot2 = %.2f-%.2fi", real, imaginary);
		}
		scan.close();
	}
}
