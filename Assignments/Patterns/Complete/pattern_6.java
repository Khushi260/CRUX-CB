public class pattern_6 {
    public static void main(String[] args) {
        int n =5;
        int row=1;
        int nst = n;
        int nsp = 1;
        while(row<=n){

            int csp=0;
            while(csp<nsp){
                System.out.print("  ");
                csp++;
            }


            int cst=0;
            while (cst<nst){
                System.out.print(" *");
                cst++;
            }

            nst--;
            nsp = nsp+2;
            System.out.println();
            row++;
        }
    }
}
