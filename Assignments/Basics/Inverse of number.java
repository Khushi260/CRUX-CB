// https://hack.codingblocks.com/app/contests/3567/698/problem



import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
        int position=0, ans=0;
    

        while(num>0){

            
            position++;
            int digit = num%10;
            num=num/10;
             
            double mult = Math.pow(10,digit-1);
            int i = (int)Math.round(mult);
            ans = (int)Math.round(ans + position*mult);
            

        }

        System.out.println(ans);


    }
}
