import java.util.*;
public class pattern_rohombus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = 3;
        int row=1;
        int nst=1;
        int nsp=n-1;
        int start_bye = 1;

        while(row<=2*n-1) {

            int csp = 0;
            while (csp < nsp) {
                System.out.print("\t");

                csp++;
            }

            int cst = 0;
            int ntp = start_bye;
            while (cst < nst) {
                System.out.print( "\t"+ntp);
                if (cst < nst / 2) {
                    ntp++;
                } else {
                    ntp--;
                }

                cst++;
            }


          if(row<n){
              nsp--;
              start_bye++;
              nst=nst+2;
          }else{
              nsp++;
              start_bye--;
              nst=nst-2;
          }
            System.out.println();
            row++;
        }
    }

}