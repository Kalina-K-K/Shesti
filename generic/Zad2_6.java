package generic;

import java.util.ArrayList;
import java.util.Random;

public class Zad2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<>();
		str.add("az");
		str.add("ti");
		str.add("toi");
		str.add("tq");
		str.add("to");
		str.add("nie");
		str.add("vie");
		str.add("te");
		
		shuffle(str);
		for(int i=0; i<str.size();i++) {
			System.out.println(str.get(i));
		}
		
		ArrayList<Character> ch = new ArrayList<>();
		ch.add('k');
		ch.add(';');
		ch.add('R');
		ch.add('r');
		
		sort(ch);
		for(int i=0; i<ch.size();i++) {
			System.out.println(ch.get(i));
		}
		
		ArrayList<Double> db = new ArrayList<>();
		db.add(2.38);
		db.add(19.0);
		db.add(-1.12);
		
		System.out.println(min(db));
	}
	
	public static <E> void shuffle(ArrayList<E> list) {
	int n = list.size();
    Random random = new Random();
    random.nextInt();
    for (int i = 0; i < n; i++) {
        int change = i + random.nextInt(n - i);
        E helper = list.get(i);
        list.set(i, list.get(change));
        list.set(change, helper);
    }
}

public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
		E currentMin;
		int currentMinIndex;

		for (int i = 0; i < list.size() - 1; i++) {
			currentMin = list.get(i);
			currentMinIndex = i;
			for (int j = i + 1; j < list.size(); j++) {
				if (currentMin.compareTo(list.get(j)) > 0) {
					currentMin = list.get(j);
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list.set(currentMinIndex, list.get(i));
				list.set(i,currentMin);
			}
		}
	}
public static <E extends Comparable<E>> E min(ArrayList<E> list) {
	E min = list.get(0); 

    int n = list.size(); 

    for (int i = 1; i < n; i++) { 
        if (list.get(i).compareTo(min)<0) { 
            min = list.get(i); 
        } 
    } 
    return min;
}

}
