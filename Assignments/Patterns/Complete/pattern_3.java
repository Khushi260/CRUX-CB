public class pattern_3 {
    public static void main(String[] args) {

        int n =5;
        int row=1;
        int nst = n;

        while(row<=n){
            int cst=0;
            while (cst<nst){
                System.out.print(" *");
                cst++;
            }
            nst--;
            System.out.println();
            row++;
        }
    }
}
