package generic;
import java.util.Scanner;
public class Zad1_5_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Zad1_5<String> stack1 = new Zad1_5<>();
		System.out.println("Input 5 strings.");
		for(int i=0;i<5;i++) {
			stack1.push(sc.nextLine());
		}
		for(int i=0; i<5; i++) {
			System.out.println(stack1.pop());
		}
	}

}
