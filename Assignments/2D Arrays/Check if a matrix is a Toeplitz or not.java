/*
Given an M × N matrix, check if it is a Toeplitz matrix or not. A Toeplitz matrix or diagonal-constant matrix is a matrix in which each descending diagonal from left to right is constant.

Any N × M matrix Mat of the form is a Toeplitz matrix if Mat(i, j) = Mat(i+1, j+1) = Mat(i+2, j+2) and so on… Here, Mat(i, j) denotes the element Mat[i][j] in the matrix.

For instance, the following matrix is a Toeplitz matrix:

Toeplitz Matrix

 

Input Format
Two integers M and N representing rows and columns of the matrix
N*N integers representing elements of square matrix.

Constraints
0<=M,N<=10
0<=mat[i][j]<=100.

Output Format
true or false

Sample Input
4 5
3 7 0 9 8
5 3 7 0 9 
6 5 3 7 0 
4 6 5 3 7 
Sample Output
true
Explanation
None.
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
         Scanner scn = new Scanner(System.in);
         int row = scn.nextInt();
         int col = scn.nextInt();
         int[][] arr=new int[row][col];

         //input
         for(int i=0; i<row; i++){
             for(int j=0; j<col; j++){
                 arr[i][j]=scn.nextInt();
             }
        }

      System.out.println(IsToeplitz(arr, row, col));  
    }

    public static boolean IsToeplitz(int[][]arr, int row, int col){

        for(int i=0; i<row-1; i++){
             for(int j=0; j<col-1; j++){
                 if(arr[i][j] != arr[i+1][j+1])
                  return false;
             }
        }
        return true;
    }
}
