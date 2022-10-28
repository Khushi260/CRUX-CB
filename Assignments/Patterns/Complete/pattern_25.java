public class pattern_25 {
    public static void main(String[] args) {

        int n = 5;
        int row = 1;
        int nsp = n-1;
        int nst = 1;
        int ntp = 1;
        while(row<=n){

            int csp=0;
            while(csp<nsp){
               System.out.print(" \t");
               csp++;
            }

            int cst=0;
            while(cst<nst){
                System.out.print("\t"+ ntp);
                ntp++;
                cst++;
            }

            nsp--;
            nst = nst + 2;
            row++;
            System.out.println();
        }

    }
}
