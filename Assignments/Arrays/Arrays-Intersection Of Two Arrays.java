//https://hack.codingblocks.com/app/contests/3567/173/problem

/*
Take as input N, the size of array. Take N more inputs and store that in an array. Take N more inputs and store that in another array. Write a function which gives the intersection of two arrays in an ArrayList of integers and Print the ArrayList.

Input Format
First line contains N denoting the size of the two arrays. Second line contains N space separated integers denoting the elements of the first array. Third line contains N space separated integers denoting the elements of the second array.

Constraints
Length of Arrays should be between 1 to 100000.

Output Format
Display the repeating elements in a comma separated manner enclosed in square brackets. The numbers should be sorted in increasing order.

Sample Input
7
1 2 3 1 2 4 1
2 1 3 1 5 2 2
Sample Output
[1, 1, 2, 2, 3]
Explanation
Check which integer is present in both the arrays and add them in an array .Print this array as the ans.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] arr1 = new int[n];
       int[] arr2 = new int[n];

       for(int i=0; i<n; i++){
           arr1[i] = scn.nextInt();
       }

        for(int i=0; i<n; i++){
            arr2[i] = scn.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //System.out.println("Arr1 => "+Arrays.toString(arr1));
        //System.out.println("Arr2 => "+Arrays.toString(arr2));

        ArrayList<Integer> ans_list = new ArrayList<Integer>();

        int i=0, j=0;
        while(i<n && j<n){
            if(arr1[i]==arr2[j]){
               // System.out.print(arr1[i]+" ");
                ans_list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]>arr2[j]) {
                       j++;
            }else{
                i++;
            }
        }

         System.out.println(ans_list);

        
    }
}
