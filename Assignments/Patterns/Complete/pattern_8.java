public class pattern_8 {
    public static void main(String[] args) {
        int n =5;
        int row=1;
        int nst=n;
        while(row<=n){
            int cst=0;
            while(cst<nst){
                if(row==cst+1 || row+cst==n) {
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
                cst++;
            }

            System.out.println();
            row++;
        }
    }
}
