package recursion;

import java.util.Scanner;

public class Method3_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N=?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(powOfTwo(n));
	}
	public static long powOfTwo(int n) {
		long result=1;
		for(int i=1;i<=n;i++) {
			result*=2;
		}
		return result;
	}
}
