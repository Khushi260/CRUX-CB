package lec2;

public class hcf {

	public static void main(String[] args) {
		int a = 6;
		int b = 15;
		int divisor = a;
		int dividend = b;
		
		while(divisor != 0) {
			
			int rem = dividend % divisor;
			
			dividend = divisor;
			divisor = rem;
		}
		
		System.out.println("HCF is " + dividend);
		
		


	}

}
