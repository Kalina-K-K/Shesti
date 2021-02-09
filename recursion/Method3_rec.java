package recursion;

import java.util.Scanner;

public class Method3_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N=?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(powOfTwo(n));
	}
	public static long powOfTwo(int n) {
		if(n==0) {
			return 1;
		}else {
			return 2*powOfTwo(n-1);
		}
	}

}
