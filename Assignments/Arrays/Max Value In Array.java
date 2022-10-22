https://hack.codingblocks.com/app/contests/3567/477/problem
/*
Take an input N, the size of array. Take N more inputs and store that in an array. Write a function which returns the maximum value in the array. Print the value returned.

1.It reads a number N.

2.Take Another N numbers as input and store them in an Array.

3.calculate the max value in the array and return that value.

Input Format
First line contains integer n as size of array. Next n lines contains a single integer as element of array.

Constraints
N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000

Output Format
Print the required output.

Sample Input
4
2
8
6
4
Sample Output
8
Explanation
Arrays= {2, 8, 6, 4} => Max value = 8 .
*/


import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int arr[] = new int[n];

      for(int i=0; i<n; i++){
          arr[i]=scn.nextInt();

      }

     int max = arr[0]; 

     max_value(arr, max, n);
    }

    public static void max_value (int[] arr,int max, int n ){
          
          for(int i=0; i<n; i++){
              if(arr[i]>max){
                  max = arr[i];
              }
          }

          System.out.println(max);
      }
}
