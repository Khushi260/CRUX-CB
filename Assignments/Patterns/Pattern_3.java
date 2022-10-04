package Patterns;
import java.util.*;

public class Pattern_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = scn.nextInt();
        int row = 1;
        int nmst = n-1;

        while(row<=n){

            int cst=0;
            while(cst<=nmst){
                System.out.print("*");
                cst++;
            }
            nmst--;

            System.out.println();
            row++;
        }
    }
}
