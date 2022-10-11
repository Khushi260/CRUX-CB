/*
Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

Input Format
Constraints
0 < N <= 1000000000

Output Format
Sample Input
63
Sample Output
77
Explanation
Both input and output are integers
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans =0, i=0;

        while(num !=0 ){
            int rem = num % 8;
            num = num/8;

            int mult = (int)Math.pow(10,i);

            ans = ans + rem*mult;

            i++;

        }
        System.out.println(ans);
    }
}
