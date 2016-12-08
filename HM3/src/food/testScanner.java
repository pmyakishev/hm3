package food;

import java.util.Scanner;

public class testScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Print enter 3 numbers (doubles)");
		
		double i = sc.nextDouble();
		double j = sc.nextDouble();
		double k = sc.nextDouble();
		double sum = i+j+k;
		
		System.out.println("The sum of numbersis: "  +sum);
				
	}

}
