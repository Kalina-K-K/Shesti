package recursion;

public class Zad1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum is " + sum(7,0));
	}
	public static int sum(int n, int result) {
	   	 if (n == 0)
	   		 return result;
	   	 else
	   		 return sum(n - 1,result+n);
	}

}
