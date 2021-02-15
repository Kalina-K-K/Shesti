package recursion;

public class Zad1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(odd(49));
		System.out.println(odd(128));
		System.out.println(even(1));
		System.out.println(even(6));
	}
	public static boolean odd(int n) {
		if(n==0) {
			return false;
		}else if(n==1) {
			return true;
		}else{
			return odd(n-2);
		}
	}
	
	public static boolean even (int n) {
		if(n==0) {
			return true;
		}else if(n==1) {
			return false;
		}else{
			return even(n-2);
		}
	}

}
