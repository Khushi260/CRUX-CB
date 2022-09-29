// https://hack.codingblocks.com/app/contests/3567/215/problem

import java.util.*;
public class Main {
    public static void main(String args[]) {

 Scanner scn = new Scanner(System.in);
		int dividend = scn.nextInt();
        int divisor = scn.nextInt();
        int multipleoftwonum = dividend*divisor;
    
        while(divisor != 0) {
			
			int rem = dividend % divisor;
			
			dividend = divisor;
			divisor = rem;
		}
        
		int lcm = multipleoftwonum/dividend;
		System.out.println(lcm);
    }
}
