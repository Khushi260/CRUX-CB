// https://hack.codingblocks.com/app/contests/3567/919/problem



import java.util.*;
public class Main {
    public static void main(String args[]) {

       Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int div=1, count=0;
         
         while(n>=div){

             if(n%div==0){
                 count++;
             }
             
             div++;
         }

         if(count==2){
             System.out.println("Prime");
         }
         else{
             System.out.println("Not Prime");
         }
    }
}
