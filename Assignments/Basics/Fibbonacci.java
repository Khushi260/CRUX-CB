// https://hack.codingblocks.com/app/contests/3567/242/problem


import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
		int i =1;
		int a=0; 
		int b=1;
	
		while(i<=n) {
			
			 int c = a+b;
			
			i++;
			a=b;
			b=c;
		}
		System.out.println(a);

    }
}
