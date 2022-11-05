import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        IsArmstrong(num);
    }
    public static int numberofdigits(int num){
        int nod=0;
        while(num>0){
            int digit = num%10;
            nod++;
            num=num/10;
        }
        return nod;
    }
    
    public static void IsArmstrong(int num){
         int backup = num;
        int nod = numberofdigits(num);
        int ans = 0;
        while (num > 0) {
            int digit = num % 10;
            ans = ans + (int)Math.pow(digit, nod);
            num /= 10;
        }
         if(ans == backup){
             System.out.println("true");
         }else{
             System.out.println("false");
         }

    }
    
}
