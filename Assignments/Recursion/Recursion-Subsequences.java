/*
Take as input str, a string. We are concerned with all the possible subsequences of str. E.g.

a. Write a recursive function which returns the count of subsequences for a given string. Print the value returned.

b. Write a recursive function which prints all possible subsequences for a “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”, “bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.given string (void is the return type for function).
Note: Use cin for input for C++

Input Format
Enter a string

Constraints
None

Output Format
Print all the subsequences in a space separated manner and isplay the total no. of subsequences.

Sample Input
abcd
Sample Output
 d c cd b bd bc bcd a ad ac acd ab abd abc abcd 
16
Explanation
Print all possible subsequences of the given string.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner scn = new Scanner(System.in);
       String s = scn.nextLine();
       ArrayList<String> ans = new ArrayList<>();
        sub_seq(s,"", ans);
        System.out.println();
        System.out.println(ans.size());
    }

    public static void sub_seq(String s, String path, ArrayList<String> ans){

        if(s.isEmpty()){
            System.out.print(path+" ");
            ans.add(path);
            return;
        }
        char ch = s.charAt(0);
        String remain = s.substring(1);
        sub_seq(remain,path,ans); //exclude
        sub_seq(remain,path+ch,ans); //include
        
    }
}
