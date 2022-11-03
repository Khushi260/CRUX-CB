//https://hack.codingblocks.com/app/contests/3567/173/problem

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int[] arr1 = new int[n];
       int[] arr2 = new int[n];

       for(int i=0; i<n; i++){
           arr1[i] = scn.nextInt();
       }

        for(int i=0; i<n; i++){
            arr2[i] = scn.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //System.out.println("Arr1 => "+Arrays.toString(arr1));
        //System.out.println("Arr2 => "+Arrays.toString(arr2));

        ArrayList<Integer> ans_list = new ArrayList<Integer>();

        int i=0, j=0;
        while(i<n && j<n){
            if(arr1[i]==arr2[j]){
               // System.out.print(arr1[i]+" ");
                ans_list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]>arr2[j]) {
                       j++;
            }else{
                i++;
            }
        }

         System.out.println(ans_list);

        
    }
}
