public class pattern_magic {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=n;
        int nsp=0;
        while(row<=n){
            int cst1=0;
            while(cst1<nst){
                System.out.print(" *");
                cst1++;
            }


            int csp=0;

            while(csp<nsp){
                System.out.print("  ");
                csp++;
            }

            int cst2=0;
            while(cst2<nst){
                System.out.print(" *");
                cst2++;
            }

            nst--;
            nsp=nsp+2;


            System.out.println();
            row++;
        }
    }
}
