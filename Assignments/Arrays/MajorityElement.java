import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner scn = new Scanner(System.in);
      int n=scn.nextInt();
      int[] arr = new int[n];

      for(int i=0; i<n; i++){
          arr[i]=scn.nextInt();
      }

      int majority = arr[0];
      int count=1;

      for(int i=1; i<n; i++){
          if(arr[i]==majority){
              count++;
          }
          else{
              count--;
              if(count==0){
                  majority=arr[i];
                  count=1;
              }
          }
      }

      System.out.println(majority);
      
    }
}
