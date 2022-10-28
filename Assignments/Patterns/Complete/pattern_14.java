public class pattern_14 {
    public static void main(String[] args) {
        int n=5;
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
                nst++;
            }else{
                nsp++;
                nst--;
            }

            System.out.println();
            row++;
        }
    }
}
