package Patterns;/*

 * * * * *
     * * * *
         * * *
             * *
                 *

 */



import java.util.Scanner;

public class Pattern6 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        int nst = n;
        int nsp = 0;

        while(row<=n){

            int csp=0;
            while(csp<nsp){
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while(cst<nst){
                System.out.print("* ");
                cst++;
            }


            nsp+=2;
            nst--;
            row++;
            System.out.println();
        }

    }
}
