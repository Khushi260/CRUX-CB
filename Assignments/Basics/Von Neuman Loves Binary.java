// https://hack.codingblocks.com/app/contests/3567/219/problem


import java.util.*;
public class Main {
    public static void main(String args[]) {
        
    Scanner scn = new Scanner(System.in);
	int t = scn.nextInt();
   

    for(int i =1; i<=t; i++){
      
      int num = scn.nextInt();
      int ans=0, mult=1;

        while(num>0){

            int digit=num%10;
            ans=ans+digit*mult;
            num=num/10;
            mult=mult*2;
        }

        System.out.println(ans);
     


    }




    }
}
