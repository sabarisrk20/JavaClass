import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int choice,input_number = sc.nextInt();
		/*if(a<100)
			System.out.println(a-5);
		else
			System.out.println(a+5);
		*/
		if(input_number<100)
			choice=1;
		else
			choice=2;
		
		//System.out.println(a);
		switch(choice) {	
		case(1):
			System.out.println(input_number-5);
		    break;
		case(2):
			System.out.println(input_number-5);
	        
		}
		sc.close();
	}

}
