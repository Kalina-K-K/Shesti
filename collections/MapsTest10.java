package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MapsTest10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int points = 50;
		Map<String, String> capitals =new HashMap<String, String>();
		capitals.put("China", "Beijing");
		capitals.put("Germany", "Berlin");
		capitals.put("France", "Paris");
		capitals.put("Croatia", "Zagreb");
		capitals.put("Estonia", "Tallinn");
		capitals.put("Sweden", "Stockholm");
		capitals.put("Chile", "Santiago");
		capitals.put("Czech Republic", "Prague");
		capitals.put("Norway", "Oslo");
		capitals.put("Portugal", "Lisbon");
		
		List<String> keys = new ArrayList(capitals.keySet());
		Collections.shuffle(keys);
		int count=0;
		for(String country : keys) {
			
			if(count==5) {
				break;
			}
			count++;
			String capital = capitals.get(country);
			System.out.println("The capital of " + country );
			String answer = sc.nextLine();
			if(answer.equals(capital)) {
				points+=10;
				System.out.println("Correct!");
				System.out.println(points + " points");
			}else {
				points-=10;
				System.out.println("Inorrect");
				System.out.println(points + " points");
			}
		}
		System.out.println("Final points: " + points);
	}
}
