package recursion;

import java.util.Scanner;

public class Method4_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("x=?");
		double x=sc.nextDouble();
		System.out.println("n=?");
		int n=sc.nextInt();
		System.out.println(pow(x, n));
	}
	public static double pow(double x, int n) {
		if(n==0) {
			return 1;
		}else {
			return x*pow(x,n-1);
		}
	}
}
