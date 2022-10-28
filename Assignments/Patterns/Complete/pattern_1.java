public class pattern_1 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst = n;
        while(row<=n){

            int cst=0;
            while(cst<nst){
                System.out.print("\t"+"*");
                cst++;
            }
            System.out.println();
            row++;
        }
    }
}
