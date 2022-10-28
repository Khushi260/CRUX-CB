public class pattern_mountain {
    public static void main(String[] args) {
        int n =5;
        int row = 1;
        int nst=1;
        int nsp = 2*n-3;
        int start_bye=1;
        int start_bye2=1;
        while(row<=n){

            int ntp1=start_bye;
            int cst1=0;
            while(cst1<nst){
                System.out.print(" "+ntp1);
                ntp1++;
                cst1++;
            }
            int csp=0;
            while(csp<nsp){
                System.out.print("  ");
                csp++;
            }
            int ntp2=start_bye2;
            int cst2=0 ;
            if(row==n){
                cst2 = 1;
                ntp2=start_bye2-1;
            }
            while(cst2<nst){
                System.out.print(" "+ntp2);
                ntp2--;
                cst2++;
            }

            nsp=nsp-2;
            nst++;
            start_bye2++;
            System.out.println();
            row++;
        }
    }
}
