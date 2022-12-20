/*
Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

Input Format
String

Constraints
Length of string should be between 1 to 1000.

Output Format
String

Sample Input
abC
Sample Output
ABc
Explanation
Toggle Case means to change UpperCase character to LowerCase character and vice-versa.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
       String S = scn.nextLine();
       System.out.println(change_case(S));
    }

    public static String change_case(String S){
        String ans = "";
        for(int i=0; i<S.length(); i++){
            char C = S.charAt(i);
            if(Character.isUpperCase(C)){
                C = Character.toLowerCase(C);
            }else{
                C = Character.toUpperCase(C);
            }
            ans += C;
        }
        return ans;
    }
}
