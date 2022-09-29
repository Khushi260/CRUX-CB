// https://hack.codingblocks.com/app/contests/3567/25/problem





import java.util.*;
public class Main {
    public static void main(String args[]) {
     
      Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
        int digit, sumofodd=0, sumofeven=0, digitcount=0;

        while(num>0){
            digitcount++;
            digit = num%10;
            num=num/10;

            if(digitcount%2==0){
                    
                    sumofeven += digit;

            }
            else{

                sumofodd += digit;
            }
        }

        System.out.println(sumofodd);
        System.out.println(sumofeven);

    }
}
