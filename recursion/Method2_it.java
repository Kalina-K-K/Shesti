package recursion;

import java.util.Scanner;

public class Method2_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N=?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		reverse(n);
	}
	public static void reverse(int n) {
		int digit;
		while(n>0) {
			digit=n%10;
			n=n/10;
			System.out.print(digit);
		}
	}
}
