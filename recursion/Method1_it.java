package recursion;

import java.util.Scanner;

public class Method1_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("N=?");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(add(n));
	}
	
	public static int add(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}


}
