import java.util.Scanner;

public class Pattern8 {
    public static void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 1;
        int nst = n;
        while(row<=n){

            int cst=0;
            while(cst<nst){
                if( row == cst+1 || row+cst == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                cst++;
            }


            row++;
            System.out.println();
        }
    }
}
