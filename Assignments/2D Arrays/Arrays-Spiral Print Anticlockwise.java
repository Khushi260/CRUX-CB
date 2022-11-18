/*
Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.

Input Format
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints
Both M and N are between 1 to 10.

Output Format
All M * N integers separated by commas with 'END' written in the end(as shown in example).

Sample Input
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END
Explanation
For spiral level anti-clockwise traversal, Go for first column-> last row ->last column-> first row and then do the same traversal for the remaining matrix .
*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner scn =new Scanner(System.in);
    int row = scn.nextInt();
    int col = scn.nextInt();
    int[][] arr = new int[row][col];

      for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            arr[i][j]=scn.nextInt();
        }
      }

      spiral(arr);
    }

    public static void spiral(int[][] arr){
        int minrow=0;
        int maxrow=arr.length-1;
        int mincol=0;
        int maxcol=arr[0].length-1;
        int lim = arr.length*arr[0].length;
        int count=0;

       while(count<lim){

           for(int i=minrow,j=mincol; i<=maxrow&&lim>=count; i++){
               System.out.print(arr[i][j]+", ");
               count++;
           }
           mincol++;
           
           for(int j=mincol,i=maxrow; j<=maxcol&&lim>=count; j++){
               System.out.print(arr[i][j]+", ");
               count++;
           }
           maxrow--;
          

           for(int i=maxrow,j=maxcol; i>=minrow&&lim>=count; i-- ){
               System.out.print(arr[i][j]+", ");
               count++;
           }
           maxcol--;
          

           for(int i=minrow,j=maxcol; j>=mincol&&lim>=count; j-- ){
               System.out.print(arr[i][j]+", ");
               count++;
           }
           minrow++;      
        
       }
       System.out.println("END");
    }
}
