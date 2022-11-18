/*
Given a 2D array of size N x N. Rotate the array 90 degrees anti-clockwise.



Input Format
First line contains a single integer N. Next N lines contain N space separated integers.

Constraints
N < 1000

Output Format
Print N lines with N space separated integers of the rotated array.

Sample Input
4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output
4 8 12 16 
3 7 11 15 
2 6 10 14 
1 5 9 13 
Explanation
Rotate the array 90 degrees anticlockwise.
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
         

        //input 
        for(int i=0; i<n;i++){            
            for(int j=0; j<n;j++) {
                arr[i][j]=scn.nextInt();
            }
        }
        
        reverse_column(arr);
        transpose(arr);
        
        //print 
         for(int i=0; i<n;i++){            
            for(int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    

    public static void transpose(int[][] A){
        int N = A.length;
          for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }

    }

    public static void reverse_column(int[][] B){
        int n = B.length;
       
       for(int i=0; i<n; i++){
           int s=0;
           int e=n-1;
          
           while(s < e){
             int temp = B[i][s];
             B[i][s] = B[i][e];
             B[i][e] = temp;
             s++;
             e--;
            }
       }
      
    }
   
}
