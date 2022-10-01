// https://hack.codingblocks.com/app/contests/3567/132/problem


import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
        // long digit;
        long ans=0;
        long mult=1;

        while(num !=  0){

            long digit = num % 10;

            if(digit >= 5 && num != 9){

                digit = 9-digit;
            }
            num = num / 10;
            ans = ans + digit*mult;
            // num = num/10;
            mult = mult*10;
        }

        System.out.println(ans);
    }
}
