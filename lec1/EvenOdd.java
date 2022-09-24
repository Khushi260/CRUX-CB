package lec1;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in) ;
		int num = scn.nextInt();
		int rem = num % 2;
		System.out.println(num);

		if (rem == 0) {
			System.out.println("Even");

		} else {
			System.out.println("Odd");
		}

	}
}
