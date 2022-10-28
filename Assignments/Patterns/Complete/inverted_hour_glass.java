public class inverted_hour_glass {
    public static void main(String[] args) {
        int n=5;
        int row = 1;
        int nst=1;
        int nsp= 2*n-1;
        int start_bye1=n;
        int start_bye2 =n;
        while(row<=2*n+1){

            int cst1=0;
            int ntp1=start_bye1;
        while(cst1<nst) {
            System.out.print("\t"+ntp1);
            ntp1--;
            cst1++;
        }
        int csp=0;
        while(csp<nsp) {
                System.out.print("\t");
                csp++;
            }

        int ntp2=start_bye2;
        int cst2=0;
        if(row==n+1){
            cst2=1;
            ntp2=1;
        }
        while(cst2<nst) {
                System.out.print("\t"+ntp2);
                ntp2++;
                cst2++;
            }


        if(row<n+1){
            nsp=nsp-2;
            nst++;
            start_bye2--;
        }else{
            nsp=nsp+2;
            nst--;
            start_bye2++;
        }

            System.out.println();
            row++;
        }
    }
}
