public class pattern_5 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int nsp = 1;
        int nst = n;
        while (row <= n) {


            int csp = 0;
            while (csp < nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst = 0;
            while (cst < nst) {
                System.out.print(" *");
                cst++;
            }
            nsp++;
            nst--;
            System.out.println();
            row++;
        }
    }
}
