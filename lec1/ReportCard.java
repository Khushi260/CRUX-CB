package lec1;

import java.util.Scanner;

//here order of if else matters
public class ReportCard {
	public static void main(String[] args) {
		
		
		//input 
		Scanner scn = new Scanner(System.in); //cursor create hota hai
		int marks = scn.nextInt();
		
		
		
		if (marks >= 90) {
			System.out.println("A");
		} else if ( marks>=80 && marks<90) {
			System.out.println("B");
		}

		else if (marks >= 70 &&  marks<80) {
			System.out.println("C");
		} else if (marks >= 60 && marks<70) {
			System.out.println("D");
		}

		else if (marks >= 50 && marks<60) {
			System.out.println("E");
		}
		else if (marks >= 40 && marks<50) {
			System.out.println("E");
		}

		else {
			System.out.println("FAIL");
		}

	}
}
