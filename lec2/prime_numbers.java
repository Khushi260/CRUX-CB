package lec2;
import java.util.Scanner;

public class prime_numbers {

	public static void main(String[] args) {
		
	
		System.out.print("Enter a number to be checked: ");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		//int n=6;
		
		int div =1, count=0;
		
		// 1 to n
		// 2 to n-1
		// 2 to n/2
		// 2 to squareroot of n
		
		while(div<=n) {
			
			if(n%div==0) {
				count++;
			}
			
			div++;
		}
		
		System.out.println(n + " has " + count + " number of divisors, hence ");
		
		if(count<=2) {
			System.out.print(" is a prime number");
		}
		else {
			System.out.print(" is not a prime number");
		}
		
;
	}

}
