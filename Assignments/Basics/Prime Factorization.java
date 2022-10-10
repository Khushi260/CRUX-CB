/*
Help Lakshya bhaiya do prime factorization!!

Input Format
Take an input number num.

Constraints
n<=100,000

Output Format
Print its prime factors in a single line

Sample Input
12
Sample Output
2 2 3
Explanation
Warning!! match the spacing!!
*/


import java.util.Scanner;

public class Main {
   public static void main(String args[]){
      int number;
      Scanner sc = new Scanner(System.in);
      number = sc.nextInt();
     
      for(int i = 2; i< number; i++) {
         while(number%i == 0) {
            System.out.print(i+" ");
            number = number/i;
         }
      }
      if(number >2) {
         System.out.print(number);
      }
   }
}
