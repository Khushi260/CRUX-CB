package lec2;
import java.util.Scanner;

//print nth fibbonacci  number

public class fibbonacci {

	public static void main(String[] args) {
		int n=5;
		int i =1;
		int a=0; 
		int b=1;
	
		while(i<=n) {
			
			 int c = a+b;
			
			i++;
			a=b;
			b=c;
		}
		System.out.println(a);

	}

}
//