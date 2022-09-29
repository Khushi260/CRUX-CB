//https://hack.codingblocks.com/app/contests/3567/64/problem



import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
        int n = scn.nextInt();
        int count=0;

        while(num>0){

            int digit = num%10;
            num = num/10;

            if(digit == n){
                count++;
            }
        }

        System.out.println(count);

    }
}
