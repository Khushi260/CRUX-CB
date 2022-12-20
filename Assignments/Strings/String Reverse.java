/*
Given a String line. Which may or may not have multiple words.

Reverse the whole string recursively

Input Format
Single line input containing a string

Constraints
Output Format
Print the reversed string

Sample Input
Hey there
Sample Output
ereht yeH
*/


import java.util.*;
public class Main {
    public static void main (String args[]) {
        
        Scanner scn =new Scanner(System.in);
        String s = scn.nextLine();
        reverse(s); 
    }

    public static void reverse(String s){
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
