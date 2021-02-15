package recursion;

public class Zad2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(dec2Bin(34));
	}
	public static String dec2Bin ( int value ) {
		String result="";
		int ost=value%2;
		if(value==1) {
			return "1"+result;
		}else {
			return dec2Bin(value/2) + ost + result;
		}
	}
}
