public class pattern_15 {
    public static void main(String[] args) {
        int n =5;
        int row=1;
        int nst = n;
        int nsp = 1;
        while(row<=2*n-1){

            int csp=0;
            while(csp<nsp){
                System.out.print("\t");
                csp++;
            }


            int cst=0;
            while (cst<nst){
                System.out.print("\t"+"*");
                cst++;
            }


            if(row<n) {
                nst--;
                nsp = nsp + 2;
            }else{
                nst++;
                nsp=nsp-2;
            }



            System.out.println();
            row++;
        }


    }
}
