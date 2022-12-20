/*
Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

Input Format
A single String S.

Constraints
A string of length between 1 to 1000

Output Format
The compressed String.

Sample Input
aaabbccds
Sample Output
a3b2c2ds
Explanation
In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
        String S = scn.nextLine();
        System.out.println(solve(S)); 
    }

     public static String solve(String S){
        String ans = "";
        ans += S.charAt(0);
        int count=1;
        for(int i=1; i<S.length(); i++){
            char current = S.charAt(i);
            char previous = S.charAt(i-1);

            if(current==previous){
                count++;
            }else{
                if(count>1){
                    ans+=count;
                    count=1;
                }
                ans+=S.charAt(i);
            }
        }
        if(count>1){
            ans+=count;
            count=1;
        }
        return ans;
    }
}
