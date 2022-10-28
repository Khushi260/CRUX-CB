import java.util.*;

public class mirror_star_pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int row=1;
        int nsp=n-1;
        int nst=1;
        while(row<=2*n-1){

            int csp=0;
            while(csp<nsp){
                System.out.print("  ");
                csp++;
            }

            int cst=0;
            while(cst<nst){
                System.out.print(" *");
                cst++;
            }

            if(row<n){
                nsp--;
                nst=nst+2;
            }else{
                nsp++;
                nst=nst-2;
            }

            System.out.println();
            row++;
        }
    }
}
