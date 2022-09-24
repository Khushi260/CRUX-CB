package lec2;

public class reverse_digits {
  public static void main(String[] args) {
	int num = 12345;
	int ans = 0;
	int reverse_num;
	
	while(num != 0 ) {
		int digit = num % 10;
		num = num / 10;
		ans = ans*10 + digit;
		System.out.print(digit);
	}
	System.out.print();
}
}
