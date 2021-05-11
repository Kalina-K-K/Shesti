package collections;

import java.util.PriorityQueue;

public class Zad4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		pq1.add("George");
		pq1.add("Jim");
		pq1.add("John");
		pq1.add("Blake");
		pq1.add("Kevin");
		pq1.add("Michael");
		
		PriorityQueue<String> pq2 = new PriorityQueue<String>();
		pq2.add("George");
		pq2.add("Katie");
		pq2.add("Kevin");
		pq2.add("Michelle");
		pq2.add("Rayn");
		
		PriorityQueue<String> ints = new PriorityQueue<String>(pq1);
		ints.retainAll(pq2);
		
		PriorityQueue<String> union = new PriorityQueue<String>(pq1);
		union.addAll(pq2);
		union.removeAll(ints);
		union.addAll(ints);
		
		PriorityQueue<String> diff = new PriorityQueue<String>(union);
		diff.removeAll(ints);
		
		System.out.println("Difference: " + diff);
		System.out.println("Intersection: " + ints);
		System.out.println("Union: " + union);
	}

}
