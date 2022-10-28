public class patternwith0 {
    public static void main(String[] args) {
        int n =5;
        int row=1;
        int nst = 1;
        int start_bye=1;

        while(row<=n){
            int ntp=start_bye;
            int cst=0;
            while(cst<nst){
                if(row==cst+1){
                    System.out.print("\t"+ntp);
                } else if (cst==0) {
                    System.out.print("\t"+ntp);
                } else{
                    System.out.print("\t"+"0");
                }

                cst++;
            }
            start_bye++;
            nst++;
            System.out.println();
            row++;
        }
    }
}
