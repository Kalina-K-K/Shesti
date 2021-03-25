package collections;

import java.util.LinkedList;

public class Zad5_7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> numbers = new LinkedList<>();
		
		for(int i=0; i<5_000_000; i++) {
			numbers.add(i);
		}
		
		int a=0;
		
//		for(Integer num : numbers) {
//			a=num;
//		}
		
		for(int i=0; i<50_000; i++) {
			a=numbers.get(i);
		}
		
		System.out.println(a);
	}
}
