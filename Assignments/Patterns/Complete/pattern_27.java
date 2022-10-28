public class pattern_27 {
    public static void main(String[] args) {
        int n = 5;
        int row=1;
        int nst=1;
        int nsp=n-1;
        int start_bye = 1;

        while(row<=n){

            int csp=0;
            while(csp<nsp){
                System.out.print("\t");
                csp++;
            }

            int cst=0;
            int ntp=start_bye;
            while(cst<nst){
                System.out.print(ntp+"\t");
                if(cst<nst/2){
                    ntp++;
                }
                else{
                    ntp--;
                }

                cst++;
            }
            //start_bye++;
            nst=nst+2;
            nsp--;
            System.out.println();
            row++;
        }
    }
}
