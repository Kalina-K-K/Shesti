package recursion;

import java.util.Scanner;

public class Method4_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("x=?");
		double x=sc.nextDouble();
		System.out.println("n=?");
		int n=sc.nextInt();
		System.out.println(pow(x, n));
	}
	public static long pow(double x, int n) {
		long result=1;
		for(int i=1;i<=n;i++) {
			result*=x;
		}
		return result;
	}
}
