/*
Help Lakshya bhaiya spy on Ali. Tell him how many times did you see him!!

Note : Who is ali?! An element.

Input Format
Take an input N, the size of array. Take N more inputs and store that in an array.

Take another integer input ali in the next line.

Constraints
-1000,000,000<Ali<1000,000,000 size of array < 1000,000

Output Format
The count of number of ali's in the array !!

Sample Input
6
10 20 10 20 12 20
10
Sample Output
2 
Explanation
Ali is 20.

Ali comes 2 times in the aray
*/



import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for( int i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int count = 0;

        for(int i=0; i<n; i++){
             if(arr[i]==x){
                 count++;
             }
        }

        System.out.println(count);

    }
}
