/*
Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

Input Format
String

Constraints
A string of length between 1 to 1000.

Output Format
Character

Sample Input
aaabacb
Sample Output
a
Explanation
For the given input string, a appear 4 times. Hence, it is the most frequent character.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        char charArr[] = s.toCharArray();
        Arrays.sort(charArr);
        String sorted_s = new String(charArr);
        System.out.println(max_frequency(sorted_s));
    }

    public static char max_frequency(String s){
        char ans = s.charAt(0);
       int curr_freq = 0, max_freq=0, i=1;
       for( i=1; i<s.length(); i++){
           if(s.charAt(i)==s.charAt(i-1)){
               curr_freq++;
           }else{
               if(max_freq<curr_freq){
                   max_freq=curr_freq;
                   ans=s.charAt(i-1);

               }
               curr_freq=0;
           }
       }


        if (max_freq < curr_freq) {
            max_freq = curr_freq;
            ans = s.charAt(i - 1);
        }
        return ans;

    }
}
