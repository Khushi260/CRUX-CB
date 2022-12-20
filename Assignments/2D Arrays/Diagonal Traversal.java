/*
Given an array of M x N elements (M rows, N columns), return all elements of the array in diagonal order .

Input Format
Two integers M(row) and N(column) and Second line contains N*M space separated integers denoting the elements of Array.

Constraints
The total number of elements of the given array will not exceed 10,000.

Output Format
display Diagonal

Sample Input
3 3
1 2 3 4 5 6 7 8 9
Sample Output
1 2 4 7 5 3 6 8 9 
*/

import java.util.*;
public class Main {
    public static void main (String args[]) {
        	Scanner scn = new Scanner(System.in);
		int r = scn.nextInt();
		int c = scn.nextInt();
		int[][] mat = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = scn.nextInt();
			}
		}
		traverse(mat, r, c);

    }

   
	public static void traverse(int mat[][], int r, int c) {
		int count = 0;
		int limit = r * c;
		int row = 0;
		int col = 0;
		while (count < limit) {
			while (row >= 0 && col < c) {
				System.out.print(mat[row][col] + " ");
				row--;
				col++;
				count++;
			}
			if (col >= c) {
				col = c - 1;
				row++;
			}
			row++;
			while (row < r && col >= 0) {
				System.out.print(mat[row][col] + " ");
				row++;
				col--;
				count++;
			}
			if (row >= r) {
				row = r - 1;
				col++;
			}
			col++;
		}
	}
}
